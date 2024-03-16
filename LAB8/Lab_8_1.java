
public class Lab_8_1 {
    public static void main(String[] args) {
     
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);   
                 
             int res =1;
             while(y-- > 0){
                res = res*x;
             }
             System.out.println("The ANS is " + res);
             
         }catch(Exception e){
            System.out.println(e.getMessage());
         }
        
    }
    
}
