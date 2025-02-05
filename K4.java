package linkarray;
import java.util.*;
class Employee {
	private String employeeName;
	private int employeeId;
	private String employeeDepartment;
	Employee(String employeeName,int employeeId, String employeeDepartment){
		this.employeeName=employeeName;
		this.employeeId=employeeId;
		this.employeeDepartment=employeeDepartment;
	}
	public String getName(){
		return employeeName;
	}
	public int getId(){
		return employeeId;
	}
	public String getDepartment(){
		return employeeDepartment;
	}
	public String toString(){
		return "Employee[employeeName="+employeeName+", employeeId="+employeeId+", employeeDepartment="+employeeDepartment+"]";
	}
	
}
class K4 {
public static void main(String []args) {

	ArrayList <Employee> arr = new ArrayList <Employee> ();
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of arraylist : ");
	int size =sc.nextInt();
	for(int i=0; i<size; i++){
		System.out.print("Enter employee Name >>>>> ");
		sc.nextLine();
		String employeeName = sc.nextLine();
		System.out.print("Enter employee Id >>>>> ");
		int employeeId = Integer.parseInt(sc.nextLine());
		System.out.print("Enter employee Department >>>>> ");
		String employeeDepartment =sc.nextLine();	
	Employee obj = new Employee(employeeName,employeeId,employeeDepartment);
	arr.add(obj);
	}
	
	for(Employee iterate: arr){
		System.out.println(iterate);	
	}
}
}
