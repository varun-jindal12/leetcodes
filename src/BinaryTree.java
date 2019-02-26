public class BinaryTree {
    public class Node {
        int key,value;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }

    }
    Node root;
    BinaryTree(){
        root = null;
    }
    public void insert(int key){
        root = treeInsert(root,key);
    }
    public Node treeInsert (Node root ,int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        else if(root.key > key){
           root.left = treeInsert(root.left ,key);
        }
        else if(root.key < key){
            root.right = treeInsert(root.right,key);
        }
        return root;
    }
    public void inOrder(Node root){
        if(root != null) {
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }
    /*public static void main(String args[]) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.treeInsert(binaryTree.root,50);
        binaryTree.inOrder(binaryTree.root);
    }*/
}
