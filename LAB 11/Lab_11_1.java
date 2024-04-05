import java.util.*;
import java.io.*;

class Student{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
       
        
        return this.name + " " + this.age;
    }
}

public class Lab_11_1 {
    public static void main(String[] args) {

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("Lab_11_1.txt"));
            bw.write("Bhatt Dhairya,18");
            bw.newLine();
            bw.write("Viraj Odedra ,18");
            bw.newLine();
            bw.write("Pruthviraj Chauhan,18");
            bw.close();
            System.out.println("File Created and written successfully");




        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader("Lab_11_1.txt"));
            String size;

            while((size=br.readLine())!=null){
                String name_age[] = size.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student s = new Student(name, age);
                System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
