package Arrays;
import java.util.Scanner;
public class MatrixCalculation {
 public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the no.of rows: ");
	 int rows=sc.nextInt();
	 System.out.print("Enter the no.of columns: ");
	 int cols=sc.nextInt();
	 int [][] matrix = new int [rows][cols];
	 int [][] transpose = new int [rows][cols];
	 System.out.println("Enter the elements:");
	 for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
	 for(int i=0; i<rows;i++) {
			for(int j=0; j<cols;j++) {
				transpose[i][j]=matrix[j][i];
			}
		}
	 for(int i=0; i<transpose.length;i++) {
			for(int j=0; j<transpose[i].length;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}
	 }
}
