package Arrays;
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int minIndex = 0;

        // Find the index of the minimum element in the array
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }

        // Check if the array is sorted in ascending order
        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (nums[(minIndex + i) % n] < nums[(minIndex + i - 1) % n]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
}