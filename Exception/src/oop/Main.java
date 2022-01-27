package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            int a[]= new int[3];
             a[0]=2;
             a[1]=3;
             a[2]=5;
            System.out.println(a[4]);

        } catch (Exception e) {
            System.out.println("\nMessage: "+e.getMessage());
        }
    }
}
