import java.util.ArrayList;
import java.util.List;

public class InOrderTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inOrderElements = new ArrayList<>();
        inOrderInsert(root,inOrderElements);
        return inOrderElements;

    }
    public void inOrderInsert(TreeNode root, List<Integer> inOrderElements){
        if(root != null){
            inOrderInsert(root.left,inOrderElements);
            inOrderElements.add(root.val);
            inOrderInsert(root.left,inOrderElements);
        }
    }
}
