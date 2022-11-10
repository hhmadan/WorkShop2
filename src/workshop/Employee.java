package workshop;

public class Employee {
    //instance variables
    String name;
    int mobNum;
    int age;
    String city;
    String state;
    String dept;
    String compName;

    //Constructor of Class Employee
    Employee(String name, int age, int mobNum, String city, String state, String dept, String compName){
        this.name = name;
        this.mobNum = mobNum;
        this.age = age;
        this.city = city;
        this.state = state;
        this.dept = dept;
        this.compName = compName;
    }

    //method to print all details of Employee
    void getEmpDetails(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Age: "+age);
        System.out.println("Employee Mobile Number: "+mobNum);
        System.out.println("Employee City: "+city);
        System.out.println("Employee State: "+state);
        System.out.println("Employee Department: "+dept);
        System.out.println("Employee Companies: "+compName);
    }
}
