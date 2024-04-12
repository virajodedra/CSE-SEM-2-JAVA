import java.util.scanner;
//import java.util.*;
import java.io.*;
public class QueDemo{
    public static void main(String[] args) {
        Queue<String> v = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Enter the name of the student :");
            v.add(sc.nextLine());
        }


            System.out.println("Elements in Queue:"+v);
            System.out.println("Removed element: "+v.remove());
            System.out.println("Head: "+v.element());
            System.out.println("poll(): "+v.poll());
            System.out.println("peek(): "+v.peek());
            System.out.println("Elements in Queue:"+v); 
    }
}
