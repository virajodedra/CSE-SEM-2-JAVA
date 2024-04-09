abstract class Vegetable{
    String color;
    
public Vegetable(String color){
        this.color = color;  
    }

    abstract public String toString();
}

class Potato extends Vegetable{

      Potato(String color){
        super(color);

      }
    public String toString(){
        
     return "Vegetale :potato " +color; 
 
    }
} 
class Brinjal extends Vegetable{

    Brinjal(String color){
        super(color);
    }
  public String toString(){
      
   return "Vegetale :Brinjal " +color; 

  
  }
} 
class  Tomato extends Vegetable{

    Tomato(String color){
        super(color);
    }
  public String toString(){
      
   return "Vegetale :Tomato " +color; 

  
  }
} 

public class Lab_7_1 {
    public static void main(String[] args) {
        Potato p =new Potato("skinny");
        System.out.println(p);
        Brinjal b =new Brinjal("violet");
        System.out.println(b);
        Tomato t =new Tomato("red");
        System.out.println(t);


    }
    
}
