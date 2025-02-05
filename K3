import java.util.*;

class product{
		private int pid;
		private String pname;
		private int pprice;
		private String plocation;
	
		product(int pid, String pname, int pprice, String plocation){
			this.pid=pid;
			this.pname=pname;
			this.pprice=pprice;
			this.plocation=plocation;
		}
		
		public void SetId() {
			this.pid=pid;
		}
		public int getId() {
			return pid;
		}
		
		public void SetName() {
			this.pname=pname;
		}
		public String getName() {
			return pname;
		}
		
		public void SetPrice() {
			this.pprice=pprice;
		}
		public int getPrice() {
			return pprice;
		}
		
		public void SetLocation() {
			this.plocation=plocation;
		}
		public String getLocation() {
			return plocation;
		}

		@Override
		public String toString() {
			return "product [pid=" + getId() + ", pname=" + getName() + ", pprice=" + getPrice() + ", plocation=" + getLocation() + "]";
		}
	
		
}
public class K3 {

	public static void main(String[] args) {
		ArrayList <product> ar = new ArrayList <product>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size >>>> ");
		int size=Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<size;i++) {
			System.out.print("Enter Product Id >>>> ");
			int pid = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Product Name >>>> ");
			String pname = sc.nextLine();
			
			System.out.println("Enter Product Price >>>> ");
			int pprice =Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Product Location >>>> ");
			String plocation = sc.nextLine();
			
			product obj = new product(pid,pname,pprice,plocation);
			ar.add(obj);
		}
		for(product p1:ar) {
			System.out.println(p1);
		}
		for(product p1:ar) {
			if(p1.getPrice()>500)
			System.out.println(p1.getName());
		}

	}

}
