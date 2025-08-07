class Solution {
    public int scoreOfString(String s) {
        char[] str = s.toCharArray();
        int acc = 0;
        for(int i = 0; i < str.length - 1; i++){
            int ascii = (int) str[i];
            int nextAscii = (int) str[i+1];
            int score = Math.abs(ascii - nextAscii);
            acc += score;
        }
        return acc;
    }
}
