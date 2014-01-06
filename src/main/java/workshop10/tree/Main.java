

package workshop10.tree;

import java.util.*;

/**
 *
 * @author remcoruijsenaars
 */
public class Main {
    
    public static void main(String[] args){
       
        Node question =  new Node("Question");
        Node fillInQuestion = new Node("FillInQuestion");
        Node choiceQuestion = new Node("ChoiceQuestion");
        Node numericQuestion = new Node("NumericQuestion");
        Node freeResponseQuestion = new Node("FreeResponseQuestion");
        Node multiChoiceQuestion = new Node("MultiChoiceQuestion");
        
        
        Tree tree = new Tree(question);
        
        choiceQuestion.addChildNode(multiChoiceQuestion);
        
        tree.addNodeToRoot(fillInQuestion);
        tree.addNodeToRoot(choiceQuestion);
        tree.addNodeToRoot(numericQuestion);
        tree.addNodeToRoot(freeResponseQuestion);
        
        System.out.println(tree.toString());
        
        System.out.println("Grootte boom: " + tree.size());
        
        //preOrder(tree);
        //postOrder(tree);
        //DFS(tree);
        //BFS(tree);
    }
    
    
    public static void preOrder(Tree tree){
        preOrder(tree.getRoot());
    }
    
    public static void preOrder(Node tree){
        System.out.println(tree.getData());
        for(Node node: tree.getChildren()){
            preOrder(node);
        }
    }
    
    public static void postOrder(Tree tree){
        postOrder(tree.getRoot());
    }
    
    public static void postOrder(Node node){
        for(Node nodeIter: node.getChildren()){
            postOrder(nodeIter);
        }
        System.out.println(node.getData());
    }
    
    public static void DFS(Tree tree){
        Stack<Node> stack = new Stack();
        stack.push(tree.getRoot());
        while(!stack.isEmpty()){
            Node node = stack.pop();
            System.out.println(node.getData().toString());
            
            
            Collections.reverse(node.getChildren());
            
            for(Node nodeChild : node.getChildren()){
                stack.push(nodeChild);
            }
        }
        
    }
    
    public static void BFS(Tree tree){
        
        Queue<Node> queue = new LinkedList();
        queue.offer(tree.getRoot());
        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.getData().toString());        
            for(Node nodeChild : node.getChildren()){
                queue.offer(nodeChild);
            }
        }
        
        
        
    }
    
}


