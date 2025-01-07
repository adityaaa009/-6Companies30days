class Solution20 {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> frequencyMap = new HashMap<>(); 
        long currentSum = 0;
        int uniqueNumbers = 0; 

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
            if (frequencyMap.get(nums[i]) == 1) {
                uniqueNumbers++;
            }
        }

        long maxSum = (uniqueNumbers == k) ? currentSum : 0; 

        for (int i = k; i < n; i++) {
            int removedNum = nums[i - k];
            frequencyMap.put(removedNum, frequencyMap.get(removedNum) - 1);
            if (frequencyMap.get(removedNum) == 0) {
                uniqueNumbers--;
            }

            int addedNum = nums[i];
            currentSum += addedNum - removedNum;
            frequencyMap.put(addedNum, frequencyMap.getOrDefault(addedNum, 0) + 1);
            if (frequencyMap.get(addedNum) == 1) {
                uniqueNumbers++;
            }

            if (uniqueNumbers == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}