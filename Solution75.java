class Solution75 {
        ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>(2); 
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);

            if (arr[abs_val - 1] > 0) {
                arr[abs_val - 1] = -arr[abs_val - 1];
            } else {
                ans.add(abs_val); 
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1); 
            }
        }

        return ans;
    }
}