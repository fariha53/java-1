package begineerjava;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int x, y,large;
        System.out.println("Enter 2 numbers: ");
        x = input.nextInt();
        y = input.nextInt();
        large = (x>y)?x:y;
        System.out.println("Maximum number ="+large);


    }
}
