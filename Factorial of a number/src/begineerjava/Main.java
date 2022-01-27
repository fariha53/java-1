package begineerjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int n ,fact = 1;
        System.out.println("Enter the number = ");
        n = input.nextInt();
        for (int i=n;i>=1;i--)
        {
            fact *=i;
        }
        System.out.println("Fatorial number of "+n+" = "+fact);
    }
}
