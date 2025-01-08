class Solution21 {
    private Integer[][][] f1;
    private int[] prices;
    private int n;

    public int maxProfit(int k, int[] prices) {
        n = prices.length;
        this.prices = prices;
        f1 = new Integer[n][k + 1][2];
        return dfs(0, k, 0);
    }

    private int dfs(int i, int j, int k) {
        if (i >= n) {
            return 0;
        }
        if (f1[i][j][k] != null) {
            return f1[i][j][k];
        }
        int ans = dfs(i + 1, j, k);
        if (k > 0) {
            ans = Math.max(ans, prices[i] + dfs(i + 1, j, 0));
        } else if (j > 0) {
            ans = Math.max(ans, -prices[i] + dfs(i + 1, j - 1, 1));
        }
        return f1[i][j][k] = ans;
    }
}