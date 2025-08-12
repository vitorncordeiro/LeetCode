class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int c = 0;
        for(int n : nums){
            ans[c] = nums[n];
            c++;
        }
        return ans;
    }
}
