package DataStructures.arrayDS;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        digits[n-1]++;

        for(int i = n-1; i >= 1; i--){
            if(digits[i] > 9){
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if(digits[0] > 9){
            int temp[] = new int[n+1];
            temp[0] = 1;
            temp[1] = 0;
            for(int i = 2, j = 1; j < n; i++, j++){
                temp[i] = digits[j];
            }
            return temp;
        }
        return digits;
    }
}
