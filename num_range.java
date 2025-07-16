import java.util.Scanner;
public class num_range {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the limit: ");
		int a=sc.nextInt();
		System.out.println("The numbers from 1 to "+a+" are:\n");
		int i;
		for(i=1; i<=a; i++) {
			System.out.println(i);
		}
	}
}
