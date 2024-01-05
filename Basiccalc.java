import java.util.*;

import javax.swing.DefaultBoundedRangeModel;
public class Basiccalc {

    public static void main(String[] args) {
        System.out.println("That is basic calc :");

        Scanner sc = new Scanner(System.in);

        System.out.println("what do you perform(% for modulo ,+ for addition, - for substration,* for multiplication ,/ for division)");
        char c = sc.next().charAt(0);


        System.out.println("Enter the first number :");
        Double a = sc.nextDouble();
        System.out.println("Enter the second number :");
        Double b = sc.nextDouble();

        
        switch(c){

            case '+' :
                         System.out.println("Addition :"+(a+b));
                         break;

           case '-' :
                        System.out.println("Substration :"+(a-b));
                        break;

            case '*'  :
                      System.out.println("Substration :"+(a*b));
                      break;
                      
            case '/' :
                 
                    while(b==0){
                        System.out.println("Enter B again :");
                           b = sc.nextDouble();
                    }
                      System.out.println("Division :"+(a/b));
                      break; 
                      
            case '%' :
                        System.out.println("Modulas :"+(int)(a % b));
                     break;
                     

    }
    
}
