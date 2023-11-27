import java.util.Arrays;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        nums = Arrays.stream(nums).sorted().toArray();
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                    return true;
            }
        }
        return false;
    }
}
