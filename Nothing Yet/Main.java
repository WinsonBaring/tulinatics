package Nothing Yet;

import java.util.*;
public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        try {
            String myString = null;
            String secondary;

            System.out.print("Enter a string: ");
            secondary = input.nextLine();

            if(secondary.charAt(0) != '-' && secondary.charAt(secondary.length()-1) != '-') {
                myString = secondary;
                throw new NullPointerException(myString.toUpperCase());
            } else {
                throw new NullPointerException("myString is still null");
            }

        } catch(NullPointerException npe) {
            System.out.println(npe.getMessage());
        } finally {
            System.out.println("Everything's over");
            
        }


    }
}
