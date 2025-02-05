package linkarray;
import java.util.*;
class Student{
	String name;
	int age;
	int marks;
	Student(String name, int age, int marks){
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]\n";
	}
	
	
}
public class K2 {
	public static void main(String[] args) {
		ArrayList <Student> arr = new ArrayList <Student>();
		Student obj = new Student("animesh",23,76);
		
		Student obj1 = new Student("Ravi",24,67);
		
		Student obj2 = new Student("yogendra",21,65);
		
		arr.add(obj);
		arr.add(obj1);
		arr.add(obj2);
		
		System.out.println(arr);
		
//		for(Student s:arr) {
//			System.out.println(s.name);
//			System.out.println(s.age);
//			System.out.println(s.marks);
//		}
	}

}
