class Solution {
    public int minimumOperations(int[] nums) {
        int acc = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 == 1){
                nums[i]--;
                acc++;
            }else if(nums[i] % 3 == 2){
                nums[i]++;
                acc++;
            }else{
                continue;
            }
        }
        return acc;
    }
}
