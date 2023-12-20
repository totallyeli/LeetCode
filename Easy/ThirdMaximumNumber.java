import java.util.PriorityQueue;
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            if (!queue.contains(num)) {
                queue.offer(num);
                if (queue.size() > 3) {
                    queue.poll();
                }
            }
        }
        if (queue.size() < 3) {
            while (queue.size() > 1) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}