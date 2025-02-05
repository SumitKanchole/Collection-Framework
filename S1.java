// assignment 1st (05-02-2025)
import java.util.*;
class Patient{
	String name;
	String disease;
	int age;
	int Id;
	
	public Patient(String name,String disease,int age,int Id) {
		this.name=name;
		this.disease=disease;
		this.age=age;
		this.Id=Id;
	}
	public String getName(){
	    return name;
	}

	@Override
	public String toString() {
		return "Patient Details [Patient Name = " + name + ", Patient Disease = " + disease + ", Patient Age = " + age + ", Patient Id = " + Id + "]";
	}
	
}
class S1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Collection <Patient> patient = new ArrayList <Patient>();
		String s="";
			do {
			System.out.println("Enter Patient Name >>>> ");
			String name = sc.nextLine();
			
			System.out.println("Enter Patient disease >>>> ");
			String disease = sc.nextLine();
			
			System.out.println("Enter Patient Age >>>> ");
			int age = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Patient Id >>>> ");
			int Id = Integer.parseInt(sc.nextLine());
			Patient obj = new Patient(name, disease,age,Id);
			patient.add(obj);
			
			System.out.println("if you want to add new patient... Type : 'Yes' or 'No' ");
			s = sc.nextLine();
			
			}
			while(s.equals("yes"));
		
		for(Patient bb : patient) {
			System.out.println(bb);
		}

	
	}

}
