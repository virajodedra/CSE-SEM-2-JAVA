import java.io.*;
public class Lab_11_2{
    public static void main(String[] args){
        String name = args[0];
        File file = new File(name);

        try{
            if(!(file.exists())){
                System.out.println("File does not Exists.");
            }
            else {
                if(file.isFile()){
                    System.out.println("Size of  file ="+file.length());
                }
                else{

                    File[] files = file.listFiles();

                    if(file!=null){
                        for (File f : files) {
                            System.out.println(f.getName());
                            System.out.println("Size is ="+f.length());

                        }
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
