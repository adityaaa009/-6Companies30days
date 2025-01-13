class Solution34 {
    public int findLength(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[][] dp = new int[length1 + 1][length2 + 1];
        int maxLength = 0;

        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
            }
        }

        return maxLength;
    }
}
