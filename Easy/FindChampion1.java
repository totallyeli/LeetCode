public class FindChampion1 {
    public int findChampion(int[][] grid) {
        int n = grid.length;
        int champion = -1;

        outer: for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && grid[j][i] == 1) {
                    continue outer;
                }
            }
            champion = i;
            break;
        }

        return champion;
    }
}