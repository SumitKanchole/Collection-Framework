// 3rd assignment (05-02-2025)
import java.util.*;
class library {
    String title;
    int id;
    String author;
    String IssueToStudent;
    public library(String title, int id, String author, String IssueToStudent){
        this.title=title;
        this.id=id;
        this.author=author;
        this.IssueToStudent=IssueToStudent;
    }
    public String toString(){
        return "Book in the Inventory: [Book Title : "+title+" , Book Id : "+id+" , Author : "+author+" , IssueToStudent :"+IssueToStudent+"]";
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <library> l= new LinkedList <library> ();
        String choice="";
        do{
        System.out.println("Enter book Id : ");
        int id = Integer.parseInt(sc.nextLine());
         System.out.println("Enter Book title : ");
        String title = sc.nextLine();
        System.out.println("Enter Book author Name : ");
        String author = sc.nextLine();
        System.out.println("Enter issued To Student Name : ");
        String IssueToStudent = sc.nextLine();
        library coll = new library(title,id,author,IssueToStudent);
        l.add(coll);
        
       System.out.println("if you want to add new issued book so Type...... 'yes'/'no' >>> ");
        choice = sc.nextLine();
    }while(choice.equals("yes"));
    
    
    System.out.println("Enter return Book name : ");
    String returnbook = sc.nextLine();
    
    ArrayList <library> l2 = new ArrayList <library> (l);
    
    Iterator itr = l.iterator();
    while(itr.hasNext()){
        library str = (library)itr.next();
        if(str.title.equals(returnbook)){
            itr.remove();
        }
    }
    System.out.println("Now available books are : "+l);
    
    System.out.println("All issued Book >>> ");
  for(library lib: l2){
            System.out.println(lib);
        }
     
    
    }
}
