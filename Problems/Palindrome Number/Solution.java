class Solution {
    public boolean isPalindrome(int x) {
        int xbckp = x;
        if(x < 0){
            return false;
        }
        int numeroInverso = 0;
        while (x > 0){
            int resto = x % 10;
            x -= resto;
            x /= 10;
            numeroInverso += resto;
            if(x > 0){
                numeroInverso *= 10;
            }
            
        }
        return xbckp == numeroInverso ? true : false;
    }
}
