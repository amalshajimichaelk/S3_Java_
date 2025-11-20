package arraysAndVectors;

public class ArrayOps {
	 public static void main(String [] args) {
		 int [] oneDarr = {1,2,3,4,5};
		 for (int i : oneDarr) {
			 System.out.print(i+"\t");
		 }
		 System.out.println();
		 for (int j=0; j<oneDarr.length; j++) {
			 System.out.print(oneDarr[j]+"\t");
		 }
		 int [][] twoDarr = {
				 {6,5,4},{8,7,9,3}
		 };
		 System.out.println("1st row length = "+twoDarr[0].length);
		 System.out.println("1st row length = "+twoDarr[1].length);
		 for (int i = 0; i < twoDarr.length; i++) {
			for (int j = 0; j < twoDarr[i].length; j++) {
				System.out.print(twoDarr[i][j]+"\t");
			}System.out.println();
		}
		 for (int[] arr : twoDarr) {
			for(int k : arr) {
				System.out.print(k+"\t");
			}System.out.println();
		}
		 int [] copy = new int[oneDarr.length];
		 System.out.println("Copied Array.\n");
		 System.arraycopy(oneDarr, 1, copy, 0, 4);
		 for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+"\t");
		}System.out.println();
	 }
}
