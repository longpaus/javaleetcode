package trees;

import java.util.ArrayList;
import java.util.List;

//question 113
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> sums = new ArrayList<>();
        List<Integer> currSum = new ArrayList<>();
        bfs(root, targetSum, sums, currSum, 0);
        return sums;
    }

    public static void bfs(TreeNode node, int targetSum, List<List<Integer>> sums, List<Integer> currSum, int sum) {
        if (node == null)
            return;
        currSum.add(node.val);
        sum += node.val;
        if (node.left == null && node.right == null && sum == targetSum) {
            List<Integer> copy = new ArrayList<>(currSum);
            sums.add(copy);
        }

        if (node.left != null)
            bfs(node.left, targetSum, sums, currSum, sum);

        if (node.right != null)
            bfs(node.right, targetSum, sums, currSum, sum);

        currSum.remove(currSum.size() - 1);
        sum -= node.val;

    }
}
