package trees;
//q 100
public class isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] sameTree = {true};
     doubleDfs(p,q,sameTree);
     return sameTree[0];

 }
 public static void doubleDfs(TreeNode node1, TreeNode node2,boolean[] sameTree){
     if(node1 == null && node2 == null){
         return;
     }

     if((node1 != null && node2 == null) ||(node1 == null && node2 != null) ||( node1.val != node2.val)){
         sameTree[0] = false;
         return;
     }
     doubleDfs(node1.left, node2.left, sameTree);
     doubleDfs(node1.right, node2.right, sameTree);
 } 
}

