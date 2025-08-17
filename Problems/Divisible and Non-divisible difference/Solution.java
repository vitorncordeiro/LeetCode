class Solution {
    public int differenceOfSums(int n, int m) {
        int gauss = ((1 + n) * n) / 2;
        int notDivisibles = 0;
        for(int i = 0; i <= n; i++){
            if(i % m != 0){
                notDivisibles += i;
            }
        }
        int divisibles = gauss - notDivisibles;
        return notDivisibles - divisibles;
    }
}
