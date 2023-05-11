import java.util.*;
import java.lang.reflect.*;

class Tester {
    private static List<Field> getAllFields(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.asList(type.getDeclaredFields()));
    
        if (type.getSuperclass() != null) {
            getAllFields(fields, type.getSuperclass());
        }
    
        return fields;
    }
    
    private static Field getField(Object obj, String fieldName) {
        List<Field> fields = getAllFields(new LinkedList<Field>(), obj.getClass());
        for(Field f : fields){
            if (f.getName().equals(fieldName)) {
                return f;
            }
        }
        return null;
    }

    private static Method getMethod(Object obj, String methodName) {
        Method[] methods = obj.getClass().getMethods();
        for (Method m : methods) {
            if (m.getName().equals(methodName)) {
                return m;
            }
        }
        return null;
    }
    
    public static void test(BankAccount bankAccount) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        int code = scanner.nextInt();
        if (code == 1) {
            Field accountNumber = Tester.getField(bankAccount, "accountNumber");
            Field balance = Tester.getField(bankAccount, "balance");

            if(
                (accountNumber != null && Modifier.isPrivate(accountNumber.getModifiers())) &&
                (balance != null && Modifier.isPrivate(balance.getModifiers()))
            ) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILED");
            }
        }

        else if (code == 2) {
            Method getAccountNumber = Tester.getMethod(bankAccount, "getAccountNumber");
            Method getBalance = Tester.getMethod(bankAccount, "getBalance");
            
            try {
                System.out.println(getAccountNumber.invoke(bankAccount));
                System.out.println(getBalance.invoke(bankAccount, getAccountNumber.invoke(bankAccount)));
                System.out.println("SUCCESS");
            } catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 3) {
            Method setAccountNumber = Tester.getMethod(bankAccount, "setAccountNumber");
            Method setBalance = Tester.getMethod(bankAccount, "setBalance");

            try {
                setAccountNumber.invoke(bankAccount, "123456");
                setBalance.invoke(bankAccount, 1000.0);
                System.out.println("SUCCESS");
            } catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 4) {
            String testAccountNumber = "101";
            double testBalance = 1000.0;
            BankAccount newBankAccount = new BankAccount();

            Method setAccountNumber = Tester.getMethod(newBankAccount, "setAccountNumber");
            Method setBalance = Tester.getMethod(newBankAccount, "setBalance");

            Field accountNumber = Tester.getField(newBankAccount, "accountNumber");
            Field balance = Tester.getField(newBankAccount, "balance");

            try {
                setAccountNumber.invoke(newBankAccount, testAccountNumber);
                setBalance.invoke(newBankAccount, testBalance);

                if (accountNumber != null) {
                    accountNumber.setAccessible(true);
                    Object value = accountNumber.get(newBankAccount);
                    if (!(value.toString() == testAccountNumber)) {
                        System.out.println("FAILED");
                        return;
                    }
                } else {
                    System.out.println("FAILED");
                    return;
                }

                if (balance != null) {
                    balance.setAccessible(true);
                    Object value = balance.get(newBankAccount);
                    if (!(Double.parseDouble(value.toString()) == testBalance)) {
                        System.out.println("FAILED");
                        return;
                    }
                } else {
                    System.out.println("FAILED");
                    return;
                }
          
                System.out.println("SUCCESS");
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 5) {
            String testAccountNumber = "101";
            BankAccount newBankAccount = new BankAccount();

            Method getAccountNumber = Tester.getMethod(newBankAccount, "getAccountNumber");
            Method setAccountNumber = Tester.getMethod(newBankAccount, "setAccountNumber");

            try {
                setAccountNumber.invoke(newBankAccount, testAccountNumber);
                String accountNumber = getAccountNumber.invoke(newBankAccount).toString();

                if (accountNumber == testAccountNumber) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILED");
                }
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }

        else if (code == 6) {
            String testAccountNumber = "101";
            double testBalance = 1000.123;
            BankAccount newBankAccount = new BankAccount();

            Method getBalance = Tester.getMethod(newBankAccount, "getBalance");
            Method setBalance = Tester.getMethod(newBankAccount, "setBalance");

            Method getAccountNumber = Tester.getMethod(newBankAccount, "getAccountNumber");
            Method setAccountNumber = Tester.getMethod(newBankAccount, "setAccountNumber");

            try {
                setAccountNumber.invoke(newBankAccount, testAccountNumber);
                setBalance.invoke(newBankAccount, testBalance);
                double balance = Double.parseDouble(getBalance.invoke(newBankAccount, getAccountNumber.invoke(newBankAccount).toString()).toString());

                if (balance == testBalance) {

                    balance = Double.parseDouble(getBalance.invoke(newBankAccount, "111").toString());

                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILED");
                }
            }
            catch (Exception e) {
                System.out.println("FAILED");
            }
        }
    }
}