package Arrays;

public class TwoDarray {
	public static void main(String [] args) {
		int [] [] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int size=0;
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0; i<matrix.length;i++) {
			  size += matrix[i].length;
			}
			System.out.println("Total No. of Elements: "+size);
	}
}
