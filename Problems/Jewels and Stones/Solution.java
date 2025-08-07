class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        char[] list = jewels.toCharArray();
        for(int i =0; i < list.length; i++){
            for(int j = 0; j < stones.length(); j++)
                if(stones.charAt(j) == list[i]){
                    ans++;
                }
        }
        return ans;
    }
}
