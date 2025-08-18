class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int counter = 0;
        for(int i = 0; i < ans.length; i++){
            if(nums[i] % 2 == 0){
                counter++;
            }
        
        }
        for(int i = counter; i < nums.length; i++){
            ans[i] = 1;
        } 
        return ans;
    }
}
