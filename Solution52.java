class Solution52 {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int numCount = nums.length;
        int queryCount = queries.length;
        int[] result = new int[queryCount];
        String[][] trimmedArray = new String[numCount][2];

        for (int i = 0; i < queryCount; ++i) {
            int k = queries[i][0];
            int trimLength = queries[i][1];

            for (int j = 0; j < numCount; ++j) {
                String trimmedNum = nums[j].substring(nums[j].length() - trimLength);
                trimmedArray[j] = new String[] {trimmedNum, String.valueOf(j)};
            }

            Arrays.sort(trimmedArray, (a, b) -> {
                int compareResult = a[0].compareTo(b[0]);
                return compareResult != 0 ? compareResult : Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
            });

            result[i] = Integer.parseInt(trimmedArray[k - 1][1]);
        }

        return result;
    }
}
