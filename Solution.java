class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int a = side(x1, x2, xCenter);
        int b = side(y1, y2, yCenter);
        return a * a + b * b <= radius * radius;
    }
    private int side(int i, int j, int k) {
        if (i <= k && k <= j) {
            return 0;
        }
        return k < i ? i - k : k - j;
    }
}