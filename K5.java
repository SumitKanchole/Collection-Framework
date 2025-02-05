import java.util.*;
class Book{
	String title;
	String author;
	int ISBN;
	int price;
	
	public Book(String title,String author,int ISBN,int price) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", price=" + price + "]";
	}
	
}
public class K5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Book> book = new ArrayList <Book>();
		String s="";
			do {
			System.out.println("Enter Book title >>>> ");
			String title = sc.nextLine();
			
			System.out.println("Enter Book Author >>>> ");
			String author = sc.nextLine();
			
			System.out.println("Enter Book ISBN >>>> ");
			int ISBN = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Book price >>>> ");
			int price = Integer.parseInt(sc.nextLine());
			Book obj = new Book(title,author,ISBN,price);
			book.add(obj);
			
			System.out.println("if you want to repeat this process press 'Yes' otherwise press 'No' ");
			s = sc.nextLine();
			
			}
			while(s.equals("yes"));
		
		for(Book bb : book) {
			System.out.println(bb);
		}
		
	}

}
