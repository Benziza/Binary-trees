/* 1-A class containing the left and right child of the current node and a key value */
class Node
{
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
public class BinaryTree {

    // 2-root of the binary tree
    Node root;

    public BinaryTree()
    {
        root = null;
    }

    /* 3-Function to print the result of navigating through tree levels */
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }

    /* 4-The function calculates the height of the tree
    The height of the tree is the longest path from the root node down to the farthest leaf node
     */
    int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* 5-Calculate the height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* 6-Use the highest height */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* 7-Print nodes at a specific level */
    void printGivenLevel (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    /* 8-Test the previous functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }

}
