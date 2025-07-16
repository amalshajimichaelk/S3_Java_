import java.util.Scanner;
public class factorial {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		int i, f=1;
		for(i=1; i<=a; i++) {
			f*=i;
		}
		System.out.println("The Factorial of "+a+" is: "+f );
	}
}