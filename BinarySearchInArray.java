import java.util.*;
public class BinarySearchInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of Array :");
        int a = sc.nextInt();
        boolean flag = true;

        int b[] = new int[a];

        for(int i=0 ;i<a ;i++){
             System.out.println("Enter the element ["+i+"]");
            b[i]  = sc.nextInt();
        }
        

        for(int i=0 ;i<a ;i++){
            for(int j=i+1;j<a ;j++){
            
                if(b[i]>b[j]){
                    int temp = b[i];
                    b[j] = b[i];
                    temp = b[j];

                }
            }
        }

        int low = 0 ; int upper = a-1;
        int mid = (low + upper)/2 ;
        System.out.println("Enter the number you wan find.");
        int m = sc.nextInt();

        while(low<upper){
            mid = (low + upper)/2;

            if(m==b[mid]){
                System.out.println("found");
                return;
            }
            else if(m<b[mid]){

                upper=mid-1;

            }
            else{
                low =upper +1;
            }
        }
      System.out.println("Not Found.");

    }

    
}
