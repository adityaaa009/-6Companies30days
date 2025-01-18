import java.util.Arrays;

public class Solution48 {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        int[][] combinedValues = new int[n][2];

        for (int i = 0; i < n; i++) {
            combinedValues[i][0] = aliceValues[i] + bobValues[i];
            combinedValues[i][1] = i;
        }

        Arrays.sort(combinedValues, (x, y) -> Integer.compare(y[0], x[0]));

        int aliceScore = 0, bobScore = 0;

        for (int i = 0; i < n; i++) {
            int index = combinedValues[i][1];
            if (i % 2 == 0) {
                aliceScore += aliceValues[index];
            } else {
                bobScore += bobValues[index];
            }
        }

        if (aliceScore == bobScore) {
            return 0;
        }
        return aliceScore > bobScore ? 1 : -1;
    }
}
