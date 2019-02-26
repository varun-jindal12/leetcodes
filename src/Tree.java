import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public class Node{

        String data;
        Node left,right;

        public Node (String data){
            this.data = data;
        }

        public Node(String data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    private  Node buildTree(){
        Node root = new Node("A",
                new Node("B",
                        new Node("C"),new Node("D"))
                ,new Node("E"
                        ,new Node("F"),new Node("G",
                                            new Node("H"),null)));
        return root;
    }
    public void treeCaller(){
        try{
            Node tree = buildTree();
            bfsTraversal(tree);
//            DfsTraversal(tree);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void bfsTraversal(Node tree){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(tree);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.data);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }
}
