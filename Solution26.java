class Solution {
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<Integer>(0);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int i = 0;

        for (i = 0; i < k; i++) {
            while (dq.isEmpty() == false && arr[i] >= arr[dq.peekLast()]) dq.pollLast();

            dq.add(i);
        }

        for (; i < n; i++) {
            res.add(arr[dq.peek()]);

            while (dq.isEmpty() == false && (dq.peekFirst() <= i - k)) dq.pollFirst();

            while (dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();

            dq.add(i);
        }

        res.add(arr[dq.peek()]);
        dq.pollFirst();

        return res;
    }
}
