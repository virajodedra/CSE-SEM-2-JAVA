class Even extends Thread{
    
    public void run(){
         for(int i=0;i<21;i++){
            try{
                if(i%2==0){
                    System.out.println("The number "+i+" is even ");
                    Thread.sleep(1000);
                }else{

                }
                
    
            }catch(Exception e){
                e.printStackTrace();
            }
            
         }
    }
}
class Even1 extends Thread{
    
    public void run(){
         for(int i=0;i<21;i++){
            try{
                if(i%2 != 0){
                    System.out.println("The number "+i+" is odd ");
                    Thread.sleep(1000);
                }
                else{

                }
                
    
            }catch(Exception e){
                e.printStackTrace();
            }
            
         }
    }
}
public class Lab_9_2 {
    public static void main(String[] args) {
        Even e = new Even();
        Even1 e1 = new Even1();
        e.start();
        e1.start();
        
    }
    
}
