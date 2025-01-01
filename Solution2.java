class Solution2 {
    public int findTheWinner(int n, int k) {
        if (n == 1) {
            return 1;
        }
        int sol = (findTheWinner(n - 1, k) + k) % n;
        return sol == 0 ? n : sol;
    }
}