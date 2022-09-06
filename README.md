# Binary-trees

## 1-Definition

Binary trees are hierarchical data structures, and a binary tree is a data tree in which each node has a maximum of two child nodes, which are called the right son and the left son.

The top node in the data tree is called the root, the elements that branch from one element are called children, the element above another element is called the parent element, and the elements that do not have children are called leaves.

<img src="./Images/img1.png"/>

## 2-Applications that use data trees

Data trees are used to store information in a hierarchical fashion, like a computer's file system.
There are other applications of data trees, including:<br>
1-Data trees (with some arrangement like binary data trees) allow medium-speed accesses and searches (faster than linked lists and slower than arrays).<br>
2-Data trees allow medium-speed insertions and deletions (faster than arrays and slower than unordered linked lists).<br>
3-B-Tree and B+ Tree are used to perform indexing in databases.<br>

## 3-Binary data tree

### 3-1-Definition

A tree in which each element has at most two sons is called a Binary Tree, and since each element has only two sons, it can be called the right son and the left son.

### 3-2-Binary data tree representation

The binary data tree is represented by a pointer to the top node in the data tree. If the tree is empty, the root value is NULL.

The node includes the following parts:<br>
-data.<br>
-Pointer to the left node.<br>
-Pointer to the right node.<br>
<strong>Representation in java :</strong>

```
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
```

### Create a simple binary data tree

```
      tree
      ----
       1    <-- root
     /   \
    2     3
   /
  4
```

Java :

```
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

```

### 3-3-Properties of binary data trees

1- The maximum number of nodes at any level 'l' in the binary data tree is 2^(l-1)

Remark : the root is at level 1.

This rule can be proven in the following way:
l = 1 in the root, so the number of nodes is 2^(1-1) = 1

Remark : If we assume that the maximum number of nodes at level l is
2^(l-1), and since each node in the binary data tree has only two child nodes, then the next level of this node will have twice the number of nodes, ie 2\*2^(l-1).

2- The maximum number of nodes in a binary data tree with height 'h' is
2^(h-1)

The height of the tree is the maximum number of nodes from the root to the leaf, and the height of a tree that has one node is 1.

Remark : Some books indicate that the root height is 0, so the previous formula would look like this: 2h+1-1.

3- The lowest possible height or the lowest number of levels in a binary data tree with N nodes is Log2(N+1)

Remark : If we consider the assumption that the leaf node has the height 0, then the previous formula will become: Log2(N+1) - 1.

4- A binary data tree containing L of leaves has at least Log2(L) + 1 levels

5- In a binary data tree in which each node has either 0 or 2 child nodes, the number of leaf nodes is always 1 greater than the number of nodes that have two child nodes.

### 3-4-Types of binary data trees
