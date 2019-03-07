package sorting;

/**
 * Java program for merge sort
 * 
 * @author alshasamantaray
 */
public class MergeSort {

	public void sort(int arr[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(arr, left, mid);
			sort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	public void merge(int arr[], int left, int mid, int right) {
		int sizeLeft = mid - left + 1;
		int sizeRight = right - mid;

		// copy details into temporary array
		int leftArr[] = new int[sizeLeft];
		int rightArr[] = new int[sizeRight];
		for (int i = 0; i < sizeLeft; i++)
			leftArr[i] = arr[i + left];
		for (int i = 0; i < sizeRight; i++)
			rightArr[i] = arr[i + mid + 1];
		int temp = left;
		int i = 0, j = 0;
		while (i < sizeLeft && j < sizeRight) {
			if (leftArr[i] <= rightArr[j]) {
				arr[temp] = leftArr[i];
				i++;
			} else {
				arr[temp] = rightArr[j];
				j++;
			}
			temp++;
		}

		// copy the remaining elements of the both arrays if any
		while (i < sizeLeft) {
			arr[temp] = leftArr[i++];
			temp++;
		}
		while (j < sizeRight) {
			arr[temp] = rightArr[j++];
			temp++;
		}

	}

	/** A function to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method
	public static void main(String[] args) {
		int arr[] = { 0, 109, 110, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}
