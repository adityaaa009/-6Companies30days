class Solution68 {
  
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
      
        int answer = 0;
      
        for (int elemArr1 : arr1) {
            if (isDistanceMoreThanD(arr2, elemArr1, d)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isDistanceMoreThanD(int[] sortedArr2, int elemArr1, int d) {
        int left = 0;
        int right = sortedArr2.length;
      
        while (left < right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow compared to (left + right) / 2.
            if (sortedArr2[mid] >= elemArr1 - d) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
      
        return left >= sortedArr2.length || sortedArr2[left] > elemArr1 + d;
    }
}