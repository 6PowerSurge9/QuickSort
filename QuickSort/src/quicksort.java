import java.util.Arrays;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {76, 34, 88, 13, 21, 10, 99};
		System.out.println(Arrays.toString(data));
		int pivoteIndex = partition(data, 0, 7);
		System.out.println(pivoteIndex);
		System.out.println(Arrays.toString(data));
	}

	public static void quicksort(int[ ] data, int first, int n) {
		int pivotIndex; // Array index for the pivot element
		int n1; // Number of elements before the pivot element
		int n2; // Number of elements after the pivot element
		if (n > 1) {
	// Partition the array, and set the pivot index.
			pivotIndex = partition(data, first, n); // it does steps 1 to 3
	// Compute the sizes of the two pieces.
			n1 = pivotIndex - first;
			n2 = n - n1 - 1;
	// Recursive calls will now sort the two pieces.
			quicksort(data, first, n1); // step 4
			quicksort(data, pivotIndex + 1, n2); // step 5
		}
	}
	private static int partition(int[] data, int first, int n){
		return n;
		// implement the pseudocode:
		
	}
}
