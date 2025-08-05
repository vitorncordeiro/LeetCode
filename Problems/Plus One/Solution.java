class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for(int i=0; i < digits.length; i++){
            str += digits[i];
        }
        Integer num = Integer.parseInt(str);
        num ++;
        int[] finalArray = new int[num.toString().length()];
        for(int i= finalArray.length - 1; i >= 0; i--){
            int numRest = num % 10;
            finalArray[i] = numRest;
            num -= numRest;
            num /= 10;
        }
        return finalArray;
    }
}
