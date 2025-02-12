
public class Contains_Duplicate_II {
    // Given an integer array nums and an integer k, return true if there are two
    // distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
    // - j) <= k.

    // Example 1:

    // Input: nums = [1,2,3,1], k = 3
    // Output: true
    // Example 2:

    // Input: nums = [1,0,1,1], k = 1
    // Output: true
    // Example 3:

    // Input: nums = [1,2,3,1,2,3], k = 2
    // Output: false

    public static void main(String[] args) {
        int i = 0;
        int[] nums = { 1, 2, 2, 4 };
        while (i < nums.length ) {
            if (nums[i] != i + 1) {
                int correct = nums[i] ;
                if (nums[i] != nums[correct]) {
                    int temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
                } else {
                    System.out.println(nums[i]);
                }
            }else{
                i++;
            }

        }
        // for (int i = 0; i < nums.length ; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if(nums[i] == nums[j]){
        // if(Math.abs(i - j) <= k){
        // System.out.println(Math.abs(i-j));
        // break;
        // }
        // }
        // }
        // }

    }
}