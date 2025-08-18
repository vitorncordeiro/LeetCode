import java.util.Arrays;

class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < ans.length; i++){
            if(nums[i] % 2 == 0){
                ans[i] = 0;
            }else{
                ans[i] = 1;
            }
        
        }
         Arrays.sort(ans);
        return ans;
    }
}
