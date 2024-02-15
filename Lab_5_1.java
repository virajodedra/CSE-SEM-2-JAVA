import java.util.*;
import java.math.*;
public class Lab_5_1 {
    public static void main(String[] args) {
        Circle S1 = new Circle();
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double r = sc.nextDouble();

        double area = S1.Area( r);
        S1.Print( area);
        
    }
    
}

  class Circle{

        public double Area(Double r){

        double a = Math.PI*r*r;

        return a;
        

        }

        public void Print(double a){
            System.out.println(a);

        }

  }
