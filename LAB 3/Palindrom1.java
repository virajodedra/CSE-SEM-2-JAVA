import java.util.*;
public class Palindrom1 {
    
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Input : ");

            String a = sc.next();
            int start=0;
            int end=a.length()-1;
            int c=0;

           while(start<end){

            if(a.charAt(start) != a.charAt(end)){
                  
                  c=1;
                  break;

            }
            
              start++;
              end--;

           }

           if(c==1){
            System.out.println("The input is not palindrom.");
            }
             else{

                 System.out.println("The input is palindrom.");
             }
             
        }
    
}
