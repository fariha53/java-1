package oop;

public class Main implements Printable, Showable{

    public static void main(String[] args) {
	// write your code here
        Main main= new Main();
        main.print();
        main.show();
    }

    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void show() {
        System.out.println("Showing");
    }
}
