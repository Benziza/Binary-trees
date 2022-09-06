import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    // 1-A node in a binary tree has a key, a pointer to the left child node, and a pointer to the right child node
    static class Node {
        int key;
        Node left, right;

        Node(int key){
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp = root;

    // 2-Navigate through the levels of the binary tree

    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key+" ");
        inorder(temp.right);
    }

    // 3-A function to insert an element into the binary tree
    static void insert(Node temp, int key)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        // 4-Navigate through the levels of the binary tree in search of an empty space
        while (!q.isEmpty()) {
            temp = q.peek();//5-get head element (the first element added)
            q.remove();//6-remove the first element added

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }
    // 7-test the previous functions
    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print( "Inorder traversal before insertion:");
        inorder(root);

        /*
			 10
			/   \
		   11    9
		  / \   / \
		 7 null 15 8  */

        int key = 12;
        insert(root, key);

        /*
			 10
			/   \
		   11    9
		  / \   / \
		 7  12 15  8  */
        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}
