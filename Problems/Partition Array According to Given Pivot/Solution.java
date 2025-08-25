class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int less = 0;
        
        int equals = 0;

        for(int i:nums){
            if(i < pivot){
                ans[less] = i;
                less++;
            }else if(i == pivot){
                equals++;
            }
        }
        
        for(int i = 0; i < equals; i++){
            ans[less] = pivot;
            less++;
        }


        for(int i = 0; i < nums.length;i++){
            if(nums[i] > pivot){
                ans[less] = nums[i];
                less++;
            }
            
        }
        return ans;
    }
}
