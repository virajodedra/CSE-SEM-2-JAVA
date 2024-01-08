public class pattern2 {
    public static void main(String[] args) {
        
          int n=5,j,i;

          for(i=1;i<=n;i++){
            for(j=1;j<=5-i;j++){

                System.out.print(" ");

            }

            for(j = 1; j <= i; j++) {

                    if((j == 1 || j == i) && i!=5){
                        System.out.print("* ");
                        
                    }
                    else if(i == 5 && (j<5)) {
                            System.out.print("**");

                    }

                    else if(j==5){

                        System.out.println("*");

                           
                    }
                    else {
                        System.out.print("  ");
                    }

                }
                   System.out.println();
                
            }
    
             
          }

    }

