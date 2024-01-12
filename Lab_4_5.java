import java.util.*;
public class Lab_4_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.nextLine();
        int a = s.length();

        System.out.println("The length of string is :"+a);

        System.out.println("Second Half string :");

        for(int i = s.length()/2 ; i < s.length();i++){

            System.out.print(s.charAt(i));

        }


    }


    
}
