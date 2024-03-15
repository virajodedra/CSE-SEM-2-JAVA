import java.util.*;

class Parent{
     int a;

    public void getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        
    }

    public void print(){
        System.out.println("The value of a is :"+a);
    }
}


    class Child extends Parent{
        public Child(){
          super();
          
        }
   

}
public class Lab_6_6 {
    public static void main(String[] args) {
        Child c = new Child();
        c.getInt();
        c.print();
        
        
    }
    
}
