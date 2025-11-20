package arraysAndVectors;
import java.util.*;
public class VectorOps {
	public static void main(String [] args) {
		Vector<Integer> numbers1 = new Vector<>(Arrays.asList(1,2,3,4,5));
		Vector<Integer> num2 = new Vector<>();
		num2.addAll(numbers1);
		num2.add(6);
		num2.add(6, 10);
		System.out.println(num2.get(3));
		Iterator<Integer> itr = num2.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"\t");
		}
		System.out.println("\n"+num2.remove(1));
		num2.removeAllElements();
		System.out.println(num2);
		num2.clear();
		System.out.println(num2);
	}
}
