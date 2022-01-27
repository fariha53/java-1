package oop;

public class Main {

    public void eligible(int age)
        {
            if(age<18){
throw new ArithmeticException("You are not eligible to vote ");

            }
            else {
System.out.println("You are eligible");
            }
    }


    public static void main(String[] args) {
Main main = new Main();
main.eligible(14);

    }
}
