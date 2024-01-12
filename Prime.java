import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter thre number :");
        
        int a =sc.nextInt();
        int n=0;

         boolean prime = true;
        for(int i=2;i<=a/2;i++){

            if(a%i==0){
                prime = false;
                break;
            }

        }
    
        if(prime){
            System.out.println("The number is Prime.");
        }

            else{
                System.out.println("the number is not Prime.");
            }
        

    }
    
}
