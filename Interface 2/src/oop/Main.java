package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CentralBank bank= new EBL();
       System.out.print("\nTotal income of EBL yearly ="+bank.income()+"\n");
    }
}
