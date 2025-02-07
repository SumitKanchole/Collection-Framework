// 2nd assignment (05-02-2025)
import java.util.*;
class library {
    String BookName;
    int noOfBook;
    public library(String BookName, int noOfBook){
        this.BookName=BookName;
        this.noOfBook=noOfBook;
    }
    public String toString(){
        return "Book in the Inventory:\n"+BookName;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <library> l= new LinkedList <library> ();
        System.out.println("Enter quantity of book : ");
        int noOfBook = Integer.parseInt(sc.nextLine());
         System.out.println("Enter Book Name : ");
        String BookName = sc.nextLine();
        library coll = new library(BookName,noOfBook);
        l.add(coll);
        
        for(library lib: l){
            System.out.println(lib);
        }
    }
}
