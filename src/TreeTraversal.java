import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> preOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return preOrder;
        stack.push(root);
        while(!stack.empty()){
            TreeNode treeNode = stack.pop();
            preOrder.add(treeNode.val);
            if(treeNode.right != null){
                stack.add(treeNode.right);
            }
            if(treeNode.left != null){
                stack.add(treeNode.left);
            }
        }
        return preOrder;
    }

    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> preOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return preOrder;
        TreeNode treeNode = root;
        while(!stack.empty() || treeNode != null){
            while(treeNode != null){
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            treeNode = stack.pop();
            preOrder.add(treeNode.val);
            treeNode = treeNode.right;
        }
        return preOrder;
    }

    /*public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> postOrder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)return postOrder;
        TreeNode treeNode = root;
        while(treeNode != null || !stack.empty()){

        }
    }*/
}
