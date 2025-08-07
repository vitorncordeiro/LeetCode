class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = Arrays.copyOf(nums, nums.length * 2);
        int z = 0;
        for(int i = nums.length; i < ans.length; i++){
            ans[i] = nums[z];
            z++;
        }
        return ans;
    }
}
