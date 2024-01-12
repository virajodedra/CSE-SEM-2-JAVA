import java.util.*;
public class ConsonantOrVovel {

    public static void main(String[] args) {
        
        System.out.println("Enter the input :");
            Scanner sc = new Scanner(System.in);

            String a = sc.nextLine();
            int c=0,v=0;

            for(int i=0;i<a.length();i++){
                
                if((a.charAt(i) == 'a')|| (a.charAt(i) == 'e') || (a.charAt(i) == 'i') ||( a.charAt(i) == 'o' )|| (a.charAt(i) == 'u') ){

                   v++;
                }
               else  if((a.charAt(i) == 'A')|| (a.charAt(i) == 'E') || (a.charAt(i) == 'I') ||( a.charAt(i) == 'O' )|| (a.charAt(i) == 'U') ){

                   v++;
               }
                else{
                    c++;
                }

            }
              

            System.out.println("The consonants are :"+c);
            System.out.println("The vovels are :"+v);

    }
    
}
