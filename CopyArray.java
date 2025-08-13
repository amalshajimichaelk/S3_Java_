package Arrays;
import java.util.Scanner;
public class CopyArray {
 public static void main(String [] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the size of the array: ");
	 int n = sc.nextInt();
	 int [] array = new int [n];
	 int [] copy = new int [n];
	 System.out.println("Enter the elments: ");
	 for(int i=0; i<n; i++) {
		 array[i]=sc.nextInt();
		 }
	 for(int i=0; i<n; i++) {
		 System.out.print(array[i]+"\t");
		 }
	 for(int i=0; i<n; i++) {
		 copy[i]=array[i];
		 }
	 System.out.println("\nCopied Array: ");
	 for(int i=0; i<n; i++) {
		 System.out.print(copy[i]+"\t");
		 }
 }
}
