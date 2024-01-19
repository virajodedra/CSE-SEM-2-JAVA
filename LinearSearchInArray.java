import java.util.*;
public class LinearSearchInArray {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] m = new int[n];

         boolean flag = true;

        
        for(int i=0;i<m.length; i++){
            
            System.out.println("ENter the element ["+i+"] :");
            m[i] = sc.nextInt();

        }

        System.out.println("Enter the number you wan a find. ");
        int b = sc.nextInt();

     
        for(int i=0;i<m.length; i++){

            
            if(m[i] == b){
                System.out.println("Found.");
                flag=false;
                break;
            }

        }
        if(flag){
            System.out.println("Not Found");
        }


    }

    
}
