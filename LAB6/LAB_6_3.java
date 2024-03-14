import java.util.*;
 class member{
     String name;
     int age;
     double phoneNumber;
     String address;
     double salary;

     Scanner sc = new Scanner(System.in);

     public member(){
         System.out.println("Enter the Name :");
         name = sc.nextLine();

         System.out.println("Enter the Age :");
         age = sc.nextInt();

         System.out.println("Enter the Phone Number :");
         phoneNumber = sc.nextDouble();

         System.out.println("Enter the Address :");
         address = sc.next();

         System.out.println("Enter the Salary :");
         salary = sc.nextDouble();
         sc.nextLine();


     }

     public void printSalary(){

            System.out.println("The Name is :"+name);
            System.out.println("The age is:"+age);
            System.out.println("The phonenumber is :"+phoneNumber);
            System.out.println("The address  is :"+address);
            System.out.println("The  Salary is :"+salary);

     }

 }

    class Employee extends member{
        
        String specialization;

        public Employee(){
            System.out.println("Enter the specialization");
            specialization = sc.nextLine();

            
        }

        public void print(){
            super.printSalary();
            System.out.println("The specialization is :"+specialization);

            
        }

        
    }

    class Manager extends member{
        String department;
        public Manager(){
                System.out.println("Enter the department");
                department = sc.nextLine();
            }

        public void print(){
            super.printSalary();
            System.out.println("The department is :"+department);
            

        }

    }


public class LAB_6_3 {
    public static void main(String[] args) {

        System.out.println("-----------For Employee------------");
        Employee e = new Employee();
        e.print();

        System.out.println("-----------For Manager------------");
        Manager m1 = new Manager();
        m1.print();
        
    }
    
}
