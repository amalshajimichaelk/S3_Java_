class _Student {
	String name;
	int age;
	
public void displayDetails(){
	System.out.println(name);
	System.out.println(age);
}
}
public class Student{
	public static void main(String [] args) {
		_Student std1=new _Student();
		std1.name="Amal";
		std1.age=19;
		std1.displayDetails();
		_Student std2=new _Student();
		std2.name="Sebin";
		std2.age=20;
		std2.displayDetails();
	}
}
