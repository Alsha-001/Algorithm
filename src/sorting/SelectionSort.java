package sorting;

/**
 * Class to implement Selection Sort
 * 
 * @author alshasamantaray
 *
 */
public class SelectionSort {

	/** Method for implementing selection sort */
	public void selectionSort(int arr[]) {
		int temp;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			if (min != arr[i]) {
				temp = arr[i];
				arr[i] = min;
				arr[index] = temp; 
			}
		}
	}
	
	/** A method to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main (String[] args) {
		int arr[] = {12, 21, 0, 8, -9, 10};
		System.out.println("Given array");
		printArray(arr);
		SelectionSort obj = new SelectionSort();
		obj.selectionSort(arr);
		System.out.println("\nSorted array");
		printArray(arr);
	}

}
