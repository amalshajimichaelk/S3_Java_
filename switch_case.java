import java.util.Scanner;
public class switch_case {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int day=sc.nextInt();
		String result = switch (day) {
		case 1 -> "Sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednsday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "Invalid Input";
		};
		System.out.println("Day : "+result);
	}
}
