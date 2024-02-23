import java.util.*;

class Complex {

    int realPart1;
     int imgPart1;
    double realPart2;
    double imgPart2;

    public Complex(int realPart1, int imgPart1) {
        this.imgPart1=imgPart1;
        this.realPart1 = realPart1;

    }

    public Complex(double realPart2, double imgPart2) {
        this.realPart2 = realPart2;
        this.imgPart2 = imgPart2;

    }

    public double add() {
        this.realPart2 += this.realPart1;
        this.imgPart2  += this.imgPart1 ;
        

         

    }

}

public class Lab_5_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther real part of first number :");
        int realPart1 = sc.nextInt();
        System.out.println("Enter the imaginary part of first number: ");
        int imgPart1 = sc.nextInt();

        System.out.println("Enter the realpart  second number :");
        Double realPart2 = sc.nextDouble();
        System.out.println("Enter the imaginary part second number");
        Double imgPart2 = sc.nextDouble();

        Complex c1 = new Complex(realPart1, imgPart1);
        Complex c2 = new Complex(realPart2, imgPart2);

         Complex res=  c2.add(c1);
         System.out.println(" " + res.realPart1+ " " + res.imgPart1 + "i");

    }

}
