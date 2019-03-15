public class MaxSumInTree {
    int maxSum = Integer.MIN_VALUE;
    public int maxSumInTree(TreeNode root){
        /*if(root.left == null && root.right == null){
            maxSum = Math.max(maxSum, root.val);
            return root.val;
        }*/
        if(root == null){
            return 0;
        }

        int left = maxSumInTree(root.left);
        int right = maxSumInTree(root.right);
        int currentSum = left + right + root.val;
        maxSum = Math.max(maxSum, currentSum);
        return  currentSum;
    }
    int getMaxSum(TreeNode root){
        maxSumInTree(root);
        return maxSum;
    }
}
