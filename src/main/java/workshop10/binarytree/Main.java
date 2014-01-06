package workshop10.binarytree;

/**
 *
 * @author remcoruijsenaars
 */
public class Main {
    public static void main(String[] args){
        
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        
        a.setLeft(b);
        a.setRight(c);
        
        b.setLeft(d);
        b.setRight(e);
        
        c.setLeft(f);
        c.setRight(g);
        
        
        BinaryTree tree = new BinaryTree(a);
        
        System.out.println(tree.getHeight());
        
        inOrderTraversal(tree);
        
    }
    
     public static void inOrderTraversal(BinaryTree tree){
        inOrderTraversal(tree.getRoot());
     }
    
    public static void inOrderTraversal(Node node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.getLeft());
        System.out.println(node.getData().toString());
        inOrderTraversal(node.getRight());
    }



}
