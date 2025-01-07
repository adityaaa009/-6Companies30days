class Solution19 {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int[] leftIncreases = new int[n]; 
        int[] rightDecreases = new int[n]; 

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                leftIncreases[i] = leftIncreases[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                rightDecreases[i] = rightDecreases[i + 1] + 1;
            }
        }

        int longestMountain = 0;
        for (int i = 1; i < n - 1; i++) {
            if (leftIncreases[i] > 0 && rightDecreases[i] > 0) {
                longestMountain = Math.max(longestMountain, leftIncreases[i] + rightDecreases[i] + 1);
            }
        }

        return longestMountain;
    }
}