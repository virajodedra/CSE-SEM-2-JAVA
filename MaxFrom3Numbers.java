import java.util.Scanner;

public class MaxFrom3Numbers {

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number A :");
    int a =sc.nextInt();

    System.out.println("Enter the Number B :");
    int b = sc.nextInt();

    System.out.println("Enter the number c  :");
    int c = sc.nextInt();

    if(a>b && a>c){

        System.out.println("The largest Number is A.");
    }
    else if(b>a && b>c){

        System.out.println("The largest Number is B.");
    }

    else{

        System.out.println("The largest Number is C.");
    }

}
    

    
}
