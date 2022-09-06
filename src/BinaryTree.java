/* 1-A class that includes the left and right child nodes of this node as well as the value of the key */
class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class BinaryTree {

    // 2-root
    Node root;

    BinaryTree()
    {
        root = null;
    }

    // 3-Postorder
    void printPostorder(Node node)
    {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    // 4-Inorder
    void printInorder(Node node)
    {
        if (node == null)
            return;

        printInorder(node.left);

        System.out.print(node.key + " ");

        printInorder(node.right);
    }

    // 5-Preorder
    void printPreorder(Node node)
    {
        if (node == null)
            return;

        System.out.print(node.key + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    // 6-simplification
    void printPostorder() {	 printPostorder(root); }
    void printInorder() {	 printInorder(root); }
    void printPreorder() {	 printPreorder(root); }

    // 7-test the previous functions
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
