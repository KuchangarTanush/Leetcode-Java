public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int currsum = nums[0];  // Start from first element
        int maxsum = nums[0];   // Initialize maxsum with first element
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to start a new subarray or continue the existing one
            currsum = Math.max(nums[i], currsum + nums[i]);
            maxsum = Math.max(maxsum, currsum);
        }
        
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}
