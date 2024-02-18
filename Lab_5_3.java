import java.security.PublicKey;
import java.util.*;

    class Vowel{
     
            int e=0;
            int a=0;
            int i=0;
            int o=0;
            int u=0;
            int x=0;
      
        String str;

        Vowel(String str){
            this.str = str;
        


        }

           void countVowel(String str){
             this.str = str;

              for(int x=0;x<str.length();x++){
             if(str.charAt(x) == 'a' || str.charAt(x)=='A'){
             
                    a++;

             }
             else if(str.charAt(x) == 'e' || str.charAt(x)=='E'){
             
                e++;

             }
             else if(str.charAt(x) == 'i' || str.charAt(x)=='I'){
             
                i++;

             }
             else if(str.charAt(x) == 'o' || str.charAt(x)=='O'){
             
                o++;

             }
             else if(str.charAt(x) == 'u' || str.charAt(x)=='U'){
             
                u++;

             }

            

        
            }
            System.out.println("a="+a+"  e="+e+"  i="+i+" o="+o+"  u="+u+"");
            
        }
       

        

          
      }


public class Lab_5_3 {

   

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        

        System.out.println("Enter the String :");
        
        String str;

        
            while(true){
                str = sc.nextLine();
                
                if(str.equals("quit")){

                    break;
                }
                Vowel v = new Vowel(str);
                v.countVowel(str);

                
            }


        }
 
    }
