import java.util.*;
class book{
    public String author;
    public String title;
    Scanner sc = new Scanner(System.in);

        public book(String author,String title){
            this.author = author;
            this.title = title;
            
        }
}
        class book_publications extends book{
          public   book_publications(String author , String title){
                super(author,title);
                
            }

            public void print(){

                System.out.println("the name of Author is :"+author);
                System.out.println("The title name is :"+title);
                
            }
        }


        class paper_publications extends book{
            paper_publications(String author,String title){
                super(author,title);
                
            }

            public void print(){

                System.out.println("the name of Author is :"+author);
                System.out.println("The title name is :"+title);

            }

        }

public class LAB_6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  name of Author :");
        String author = sc.nextLine();
        System.out.println("Enter  the title : ");
        String title = sc.nextLine();

        book b1 = new book(author,title);

        System.out.println("Write book  for book publication  or write paper  for paper  publication..");
        String name = sc.nextLine();
        
        String name2 = "book";
        String name3 = "paper";

        if(name.equals(name2)){
            book_publications b = new book_publications(author,title);
                b.print();

        }
        else if(name.equals(name3)){
            paper_publications c  = new paper_publications(author,title);
            c.print();
        }
        else{
            System.out.println("Enter valid name..");
        }
        
    }
    
}
