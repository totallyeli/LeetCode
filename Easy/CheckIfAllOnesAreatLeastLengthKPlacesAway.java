public class CheckIfAllOnesAreatLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1;
        int curr = 0;
        int n = nums.length;

        while (curr < n) {
            if (nums[curr] == 1) {
                if (prev != -1 && curr - prev - 1 < k) {
                    return false;
                }

                prev = curr;
            }

            curr++;
        }

        return true;
    }
}
