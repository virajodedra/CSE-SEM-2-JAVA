import java.util.*;
public class Result {

       public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total sum of all  subjects :");
        int total = sc.nextInt();
        System.out.println("Enter the total Subjects :");
         int subjects = sc.nextInt();

        int sum =0;
        int n;
        int marks;

        for(int i=1;i<=subjects;i++){
            System.out.println("Enter the marks :");
            marks = sc.nextInt();

            sum = sum+marks;

        }

           double c = (double)(sum*100)/(subjects*marks);
           System.out.println("the persentage is :"+c);


       }
}
