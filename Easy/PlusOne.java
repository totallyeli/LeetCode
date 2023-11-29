public class PlusOne {
    public int[] plusOne(int[] digits) {
        int current_value = 0;
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[digits.length-i-1] = digits[i];
        }
        for (int i = 0; i < reversed.length; i++) {
            if(i == 0) {
                reversed[i] += 1;
            }
            if (reversed[i] == 10) {
                reversed[i] = 0;
                if(i+1 == reversed.length){
                    reversed = new int[reversed.length+1];
                }
                reversed[i+1] += 1;
            }
        }
        int[] return_val = new int[reversed.length];
        for (int i = 0; i < reversed.length; i++) {
            return_val[reversed.length - i - 1] = reversed[i];

        }
            return return_val;
    }
}
