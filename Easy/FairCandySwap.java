public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] result = new int[2];
        int sumA = 0, sumB = 0;
        for (int i : A) {
            sumA += i;
        }
        for (int i : B) {
            sumB += i;
        }
        int diff = (sumA - sumB) / 2;
        for (int i : A) {
            for (int j : B) {
                if (i - j == diff) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
