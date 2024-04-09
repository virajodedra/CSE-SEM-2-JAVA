interface A{
    int a = 1;
    public void displayA();

}
interface A1 extends A{
    int b = 2;
    public void displayA1();

}
interface A2 extends A{
    int c = 3;
    public void displayA2();

}

interface A12 extends A1,A2{
    int d = 4;
    public void displayA12();

}

class B implements A12{
    public void displayA() {
        System.out.println(a);
    }
    public void displayA1() {
        System.out.println(b);
    }
    public void displayA2() {
        System.out.println(c);
    }
    public void displayA12() {
        System.out.println(d);
    }

}

public class Lab_7_2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        B b = new B();
        b.displayA();
        b.displayA1();
        b.displayA2();
        b.displayA12();
    }
    
}
