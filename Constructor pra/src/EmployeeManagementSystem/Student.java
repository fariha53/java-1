package EmployeeManagementSystem;

public class Student {
    int id;//class variable
    String name;
    //Default Constructor
    Student()
    {
        System.out.println("\n Student object is created");
    }
    // Parameterized Constructor
    Student(int id)
    {
        this.id= id;//Local variable
        System.out.println("Id :" +this.id);
    }

//Constructor Overloading
    Student(int id, String name)//parameter variable
    {
        this.id= id;
        this.name= name;
        System.out.println("Name :"+ this.name+"\n Id :" +this.id);
    }

}
