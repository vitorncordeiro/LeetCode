class Solution {
    public String convertDateToBinary(String date) {
        String[] arrayDates = date.split("-");
        String[] arrayDeBin = new String[3];
        for(int i=0 ;i < arrayDates.length; i++){
            StringBuilder sb = new StringBuilder("");
            int numero = Integer.parseInt(arrayDates[i]);
            while(numero > 0){
                if(numero ==1){
                    sb.insert(0, numero);
                    break;
                }
                sb.insert(0, numero % 2);
                numero /= 2;
            }
            String sbS = sb.toString();
            if(i != arrayDates.length - 1){
                sbS += "-";
            }
            arrayDeBin[i] = sbS; 
        }
        String ans = "";
        for(int i = 0; i < arrayDeBin.length; i++){
            ans += arrayDeBin[i];
        }
        return ans;
    }
}
