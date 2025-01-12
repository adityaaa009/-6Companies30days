import java.util.Arrays;

class Solution31 {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        Integer[] indices = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));
        
        Integer[] selectedIndices = Arrays.copyOfRange(indices, n - k, n);
        
        Arrays.sort(selectedIndices);
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[selectedIndices[i]];
        }
        
        return result;
    }
}
