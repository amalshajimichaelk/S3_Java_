package pack1;
import java.util.Scanner;
class Recursion{
	static void printFibonacci(int count,int n1,int n2){
		if(count>=0) {
			System.out.print(n1+" ");
			int n3=n1+n2;
			printFibonacci(--count,n2,n3);
		}
	}
}
public class FibonacciSeries {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int count,n1,n2;
		System.out.println("Enter the count: ");
		count=sc.nextInt();
		System.out.println("Enter the 1st number: ");
		n1=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		n2=sc.nextInt();
		System.out.println("Fibonacci Series: ");
		Recursion.printFibonacci(count, n1, n2);
	}
}
