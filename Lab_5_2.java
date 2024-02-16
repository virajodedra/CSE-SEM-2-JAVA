import java.util.*;
class Time{

    int hour;
    int minute;
    int second;
    
    Time(int hour,int minutes,int second){
        this.hour =hour;
        this.minute = minutes;
        this.second = second;
    }


     public void addtime(Time T1, Time T2){
          T1.second  +=  T2.second;

          if(T1.second>=60){
            T1.minute++;
            T1.second += -60;
          }
          T1.minute  +=  T2.minute;

          if(T1.minute>=60){
            T1.hour++;
            T1.minute += -60;
          }
          T1.hour  +=  T2.hour;
          

          printTime(T1);
     }

     public void  printTime(Time T1){

        System.out.print(T1.hour+" "+T1.minute+" "+second);
     }

}



public class Lab_5_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hour;
        int minute;
        int second;
        
        System.out.println("Enter the First Hours :");
        hour = sc.nextInt();
        System.out.println("Enter the First Minutes :");
        minute = sc.nextInt();
        System.out.println("Enter the First Second :");
        second = sc.nextInt();

        Time T1 = new Time(hour, minute, second);

        System.out.println("Enter the Second Hours :");
        hour= sc.nextInt();
        System.out.println("Enter the Second Minutes :");
        minute  = sc.nextInt();
        System.out.println("Enter the Second Seconds :");
        second = sc.nextInt();

        Time T2 = new Time(hour, minute, second);


        T1.addtime(T1, T2);

    }

    
    
}
