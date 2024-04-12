import java.util.*;
import java.io.*;
 class Student{
    String name;
    int age;
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
 }

 class AgeComparator implements Comparator<Student>{
    public int compare(Student o1,Student o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if(s1.age==s2.age)
            return 0;
        
        else if(s1.age>s2.age)
            return 1;
        
         else
            return -1;
        
    }
 }

public class Lab_12_Student {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
    al.add(new Student("Viraj",18));
    al.add(new Student("Manvendra",19));
    al.add(new Student("Pruthviraj",17  ));

     System.out.println("Soring by age");
     Collections.sort(al,new AgeComparator());
     Iterator<Student> it = al.iterator();

     while (it.hasNext()) {
        Student st = (Student) it.next();
        System.out.println(st.name + " " + st.age);
        
     }
    }
}
