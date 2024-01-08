public class Pattern3 {

public static void main(String[] args) {

    System.out.println("The program for pattern :");


       int n=5,i,j;

       for(i=1;i<=n;i++){
           
            for(j=1;j<(n+1)-i;j++){

                System.out.print(" ");

            }

             for(j=1;j<=i;j++){

                System.out.print("*");
             }
             
             for(j=1;j<i;j++){
                System.out.print("*");
             }

            System.out.println("");
       }

             for(i=1;i<=n;i++){


                for(j=1;j<=i;j++){
                System.out.print(" ");
             }

                 for(j=1;j<=n-i;j++){

                System.out.print("*");
              }

              for(j=1;j<=4-i;j++){
                System.out.print("*");
              }
              System.out.println();
             }
    
  }
    
}
