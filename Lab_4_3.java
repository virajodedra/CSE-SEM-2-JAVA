import java.util.*;
public class Lab_4_3 {

    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number of Array ellement :");

     int[] a = new int[sc.nextInt()];

      int c= a.length;
      double avg=0;
      int[] b = new int[a.length];
      for(int i=0;i<a.length;i++){
        System.out.println("Enter the Array elements :");
        b[i] = sc.nextInt();
  
           avg = (avg+b[i]);
        
      }
     
       avg = avg/c;

       System.out.println("The average is :" +avg);
     

    }
    
}
