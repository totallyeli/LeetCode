import java.util.ArrayList;
import java.util.List;

class AddtoArrayFormofInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = 0;
        int i = n - 1;
        while (i >= 0 || k > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num[i];
            }
            if (k > 0) {
                sum += k % 10;
                k /= 10;
            }
            num[i] = sum % 10;
            carry = sum / 10;
            i--;
        }
        List<Integer> result = new ArrayList<>();
        if (carry > 0) {
            result.add(carry);
        }
        for (int j = 0; j < n; j++) {
            result.add(num[j]);
        }
        return result;
    }
}