import java.util.*;
public class Lab_4_4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements :");
        int[] a = new int[sc.nextInt()];

        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            
            System.out.println("Enter an element in a ["+i+"] :");
            b[i] = sc.nextInt();


        }

        for(int i=a.length-1; i>=0;i--){

             System.out.print("The reverse array is ["+i+"] :"+b[i]);
        
        }
    }

    
}
