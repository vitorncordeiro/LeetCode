class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] lista = new int[101];
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            counter += lista[nums[i]];
            lista[nums[i]]++;
        }
        return counter;
    }
}
