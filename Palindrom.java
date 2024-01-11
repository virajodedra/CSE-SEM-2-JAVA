import java.util.*;

public class Palindrom {
    
        public static void main(String[] args) {

            System.out.print("Enter Input : ");
            Scanner sc = new Scanner(System.in);

            String a = sc.next();
            int start=0;
            int end=a.length()-1;
            int c=0;

             for(int i=0;i<a.length()-1;i++){
                    
                if(a.charAt(start) == ('-')  &&  ((a.charAt(start+1)>= 0 && a.charAt(start+1)<=9 ))){

                    start++;
                }

             }
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
