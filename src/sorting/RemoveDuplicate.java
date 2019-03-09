package sorting;

/**
 * Remove duplicates from sorted array and return the new length
 * 
 * @author alshasamantaray
 *
 */
public class RemoveDuplicate {

	public int removeDuplicates(int[] nums) {
		int distinctCount = 1;
		int len = nums.length;
		for (int i = 1; i < len; i++) {
			if (nums[i] != nums[i - 1])
				nums[distinctCount++] = nums[i];
		}
		return distinctCount;
	}

	/** A function to print array of size n */
	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method
	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr, arr.length);
		RemoveDuplicate ob = new RemoveDuplicate();
		int newSize = ob.removeDuplicates(arr);
		System.out.println("Duplicate removed array size : " + newSize);
		System.out.println("\nSorted array");
		printArray(arr, newSize);
	}
}
