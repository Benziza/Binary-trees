// 1-Node
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

    // 2-Binary tree root
    Node root;

    // 3-Constructors
    BinaryTree(int key)
    {
        root = new Node(key);
    }

    BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* 4-Create root*/
        tree.root = new Node(1);
        /* After executing the previous statement, the tree will look like this:
			 1
			/ \
		null   null
		*/

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
		/* 5-Node 2 and 3 become the left and right sons of Node 1
			 1
			/ \
		   2   3
		  / \ / \
		null null null null */

        tree.root.left.left = new Node(4);
        /* 6-Node 4 becomes the left son of Node 2
			 1
			/ \
		   2   3
		  / \ / \
		4  null null null */

    }
}
