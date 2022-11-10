package workshop;

import java.util.Scanner;
public class Workshop2OOPs {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome on Master Branch Message");
        //Creating objects of class employee
        Employee emp1 = new Employee("emp1",25,12345,"Bangalore","Karnataka","XYZ Dept","XYZ Pvt Ltd");
        emp1.getEmpDetails();
        System.out.println("-------------------------------------------");
        Employee emp2 = new Employee("emp2", 27, 90000,"Hyderabad","AP","ABC Dept","ABC Pvt Ltd");
        emp2.getEmpDetails();
        System.out.println("-------------------------------------------");

//        System.out.println("Enter Name of Employee: ");
//        String name = sc.next();
//        System.out.println("Enter Age of Employee: ");
//        int age = sc.nextInt();
//        System.out.println("Enter Mobile Number of Employee: ");
//        int mobNum = sc.nextInt();
//        System.out.println("Enter City: ");
//        String city = sc.next();
//        System.out.println("Enter State: ");
//        String state = sc.next();
//        System.out.println("Enter Department: ");
//        String dept = sc.next();
//        System.out.println("Enter Company Name: ");
//        String compName = sc.next();
//
//        Employee emp3 = new Employee(name,age,mobNum,city,state,dept,compName);
//        emp3.getEmpDetails();
    }
}

