import java.util.*;
 class A{
    void a(){
        System.out.println("A");
    }
 }
 class B extends A{
    void a(){
        System.out.println("B");
    }
 }
  
 
public class Dmd{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();


        a1=b1;
        a1.a();

        A a2 = new B();
        a2.a();

    }
    
}
