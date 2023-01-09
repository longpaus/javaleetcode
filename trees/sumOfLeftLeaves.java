package trees;
//q 404
public class sumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum = {0};
        dfs(root,sum,false);
        return sum[0];
   }

   public static void dfs(TreeNode node,int sum[],Boolean isLeft){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null && isLeft){
            sum[0] += node.val;
        }
        dfs(node.left,sum,true);
        dfs(node.right,sum,false);
   }
}
