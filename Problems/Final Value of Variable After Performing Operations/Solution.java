class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            x += operations[i].contains("+") ? 1 : -1;
        }
        return x;
    }
}
