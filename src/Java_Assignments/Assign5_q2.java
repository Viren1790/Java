//package Java_Assignments;
//
//// 2️⃣ Demonstrating use of super keyword to call parent class constructor
//
//class Parent {
//
//    String name;
//    int salary;
//
//    // Parent Constructor
//    Parent(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//        System.out.println("Parent Constructor Called");
//        System.out.println("Name: " + name);
//        System.out.println("Salary: " + salary);
//    }
//}
//
//class employee extends Parent {
//
//    // Child Constructor
//    employee(String name, int salary) {
//        super(name, salary);   // Calling Parent Constructor
//        System.out.println("Child Constructor Called");
//    }
//}
//
//public class Assign5_q2 {
//
//    public static void main(String[] args) {
//
//        employee obj = new employee("Viren", 1000000);
//
//    }
//}