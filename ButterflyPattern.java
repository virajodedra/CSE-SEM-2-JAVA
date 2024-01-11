public class ButterflyPattern {

    public static void main(String[] args) {
        
    

    int i,j,n=5;
   	
   	for(i=1;i<=n;i++){
   		 
   		 for(j=1;j<=i;j++){
   		 	System.out.print("*");
			}
			
			
			for (j=1; j<11-2*i; j++) {
				System.out.print(" ");
			}
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
	   }
	   for (i=1;i<=n;i++){
	   	
	   	      for(j=1;j<=6-i;j++){
	   	      	
	   	      	System.out.print("*");
				 }
				  
				  for(j=1;j<=2*(i-1);j++){
				  	System.out.print(" ");
				  }
				  
				  for(j=1;j<=5-i;j++){
				  	
				  	System.out.print("*");
				  }
	   System.out.print("*");
	   	
	   	System.out.print("\n");
	   }
   
    } 
           
    
}
