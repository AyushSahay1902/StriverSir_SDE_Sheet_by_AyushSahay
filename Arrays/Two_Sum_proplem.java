package Arrays;

public class Two_Sum_proplem {
    public int twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(nums[i]+nums[j] == target){
                    return i + j;
                }
            }
        }
        return 0;
    }
}
