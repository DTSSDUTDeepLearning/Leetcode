package SuanFa.l1738;

import java.util.PriorityQueue;

public class l1738 {

    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m][n];
        int[] nums = new int[m*n];
        pre[0][0] = matrix[0][0];
        nums[0] = pre[0][0];
        for (int i = 1;i < m;i++) {
            pre[i][0] = pre[i-1][0] ^ matrix[i][0];
            nums[i] = pre[i][0];
        }
        for (int j = 1;j < n;j++) {
            pre[0][j] = pre[0][j-1] ^ matrix[0][j];
            nums[m+j-1] = pre[0][j];
        }
        for (int i = 1;i < m;i++) {
            for (int j = 1;j < n;j++) {
                pre[i][j] = pre[i-1][j-1] ^ pre[i-1][j] ^ pre[i][j-1] ^ matrix[i][j];
                nums[m+i*n+j-2] = pre[i][j];
            }
        }
        return findKthLargest(nums, k);
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0;i < k;i++) {
            pq.offer(nums[i]);
        }
        int len = nums.length;
        for (int i = k;i < len;i++) {
            if (pq.peek() < nums[i]) {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }
}
