import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = input.nextInt();
            double[] arr = new double[size];

            for(int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i+1) + ": ");
                arr[i] = input.nextDouble();
            }

            System.out.print("Enter the index of the element to print: ");
            int to_be_print = input.nextInt();

            if(to_be_print >= size || to_be_print < 0) {
                throw new ArrayIndexOutOfBoundsException("Index " + to_be_print + " is invalid.");
            } else {
                System.out.println("Element at index " + to_be_print + ": " + String.format("%.2f", Math.round(arr[to_be_print] * 100.0) / 100.0));
            }

        } catch(ArrayIndexOutOfBoundsException o) {
            System.out.println(o.getMessage());
        }
    }
}