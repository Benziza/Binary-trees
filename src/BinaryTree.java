import java.util.LinkedList;
import java.util.Queue;

/* 1-A class containing the left and right child of the current node and a key value */
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
public class BinaryTree {

    Node root;

    // 2-The function prints the nodes in the given binary tree
    // by level using an array to create the queue
    void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {

            // 3-This function deletes the current header
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // insert left son
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // insert right son
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String args[])
    {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }

}
