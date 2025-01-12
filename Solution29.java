class Solution {
    // Function to match pairs of characters from arrays a and b
    void matchPairs(int n, char nuts[], char bolts[]) {
        int c[] = new int[n];
        int i, j = 0, k;
        int h[] = new int[256];
        for (i = 0; i < n; i++) {
            h[nuts[i]]++;
        }
        for (i = 0; i < 256; i++) {
            if (h[i] > 0) {
                nuts[j] = (char)i;
                bolts[j++] = (char)i;
            }
        }
    }
}