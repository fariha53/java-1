package oop;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            int a = 0;
            int res = 42/a;
            System.out.println("Division not possible");

        } catch (ArithmeticException e) {
            System.out.println("Exception = "+e);
            System.out.println("\nDivision by 0 is not allowed ");
        }
        System.out.println("Done");

    }
}
