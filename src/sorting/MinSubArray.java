package sorting;

/**
 * Given an unsorted array arr[0..n-1] of size n' find the minimum length
 * subarray arr[s..e] such that sorting this subarray makes the whole array
 * sorted.
 * 
 * @author alshasamantaray
 *
 */
public class MinSubArray {

	int start;
	int end;

	/** Method to find prospective start and end indices */
	public void findCandidateSubArray(int arr[]) {
		start = 0;
		int size = arr.length;
		end = size - 1;

		// find prospective start index
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				start = i;
				break;
			}
		}

		// find prospective end index
		for (int j = size - 1; j > 0; j--) {
			if (arr[j] < arr[j - 1]) {
				end = j;
				break;
			}
		}
	}

	/** Method to verify the subarray is final */
	public void checkCandidateSubArrayFinal(int arr[]) {
		int size = arr.length;
		int min = arr[start];
		int max = arr[start];

		// find min and max in subarray
		for (int i = start + 1; i <= end; i++) {
			if (arr[i] < min)
				min = arr[i];
			if (arr[i] > max)
				max = arr[i];
		}

		// Check first element greater than minimum in [0,start-1]
		for (int i = 0; i < start; i++) {
			if (arr[i] > min) {
				start = i;
				break;
			}
		}

		// Check last element less than maximum in [end+1,size-1]
		for (int j = size - 1; j > end; j--) {
			if (arr[j] < max) {
				end = j;
				break;
			}
		}
		System.out.println("\nThe start and end indices are " + start + " and " + end);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		System.out.println("Given array");
		for (int num : arr)
			System.out.print(num + " ");
		MinSubArray obj = new MinSubArray();
		obj.findCandidateSubArray(arr);
		obj.checkCandidateSubArrayFinal(arr);
	}
}
