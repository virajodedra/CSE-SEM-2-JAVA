import java.io.*;
import java.util.*;
public class Lab_12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            list.add(sc.nextLine());
        }

        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext()){
            // String s = iterator.next();
            System.out.println(iterator.next());
        }

        System.out.println("The input you give is:");
        for(String s : list){
            System.out.println(s);
        }
                
         
    }
    
}
