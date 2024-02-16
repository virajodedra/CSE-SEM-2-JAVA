import java.security.PublicKey;
import java.util.*;

    class Vowel{

        int a;
        int e;
        int i;
        int o;
        int u;
  
        String str;

        Vowel(String str){
            this.str = str;


        }

           void countVowel(String str){
             this.str = str;

              for(int x=0;x<str.length();x++){
             if(str.charAt(i) == 'a' || str.charAt(i)=='A'){
             
                    a++;

             }
             else if(str.charAt(i) == 'e' || str.charAt(i)=='E'){
             
                e++;

             }
             else if(str.charAt(i) == 'i' || str.charAt(i)=='I'){
             
                i++;

             }
             else if(str.charAt(i) == 'o' || str.charAt(i)=='O'){
             
                o++;

             }
             else if(str.charAt(i) == 'u' || str.charAt(i)=='U'){
             
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
    

