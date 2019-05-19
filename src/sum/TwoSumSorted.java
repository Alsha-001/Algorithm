package sum;

public class TwoSumSorted {
    //Approach uses two sum solution but does not use the sorted property of the array
    /*private int[] twoSum(int[] numbers, int target) {
        Map <Integer, Integer> index = new HashMap<>();
        if(numbers.length<2)
            return new int[] {-1,-1};
        for (int i=0;i<numbers.length;i++){
            if(index.containsKey(target - numbers[i]))
                return new int[] {index.get(target - numbers[i]),i+1};
            index.put(numbers[i],i+1);
        }
        return new int[] {-1,-1};
    }*/
    //Uses the property of sorted array to find out the sum
    private int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target)
                return new int[]{left + 1, right + 1};
            else if (sum < target)
                left++;
            else
                right--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        TwoSumSorted obj = new TwoSumSorted();
        int[] indices = obj.twoSum(arr, 9);
        System.out.println(indices[0] + " " + indices[1]);

    }
}
