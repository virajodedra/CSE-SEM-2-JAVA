public class Lab_8_2 {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int[] arr = new int[a];

            try{
                for(int i=0;i<a;i++){
                    arr[i] = Integer.parseInt(args[i+1]);
                     try{
                        if(arr[i]<0){
                            throw new Exception(arr[i]+ " must be positive");
                        }
                     }
                }

                

            }
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }




    }
    
}
