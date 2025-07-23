import java.util.Scanner;
public class grading_system {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark: ");
		int grade=sc.nextInt();
		if(grade>=90) {
			System.out.println("Grade A.");
		}
		else if(grade>=75) {
			System.out.println("Grade B.");
		}
		else if(grade>=60) {
			System.out.println("Grade C.");
		}
		else if(grade>=40) {
			System.out.println("Grade D.");
		}
		else {
			System.out.println("Failed.");
		}
	}
}
