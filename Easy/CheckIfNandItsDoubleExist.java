public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j && current == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
