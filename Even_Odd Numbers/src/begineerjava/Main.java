package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter number= ");
        number=input.nextInt();
        if(number%2==0)
        {
            System.out.println(number+ "is a Even numbers");
        }
        else
        {
            System.out.println(number+ "is a Odd numbers");
        }
    }
}
