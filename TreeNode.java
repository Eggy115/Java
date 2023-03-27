class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class BST {
    private TreeNode root;

    BST() {
        root = null;
    }

    public void insert(int val) {
        root = insertHelper(root, val);
    }

    private TreeNode insertHelper(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertHelper(root.left, val);
        } else if (val > root.val) {
            root.right = insertHelper(root.right, val);
        }
        return root;
    }

    public void delete(int val) {
        root = deleteHelper(root, val);
    }

    private TreeNode deleteHelper(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.val) {
            root.left = deleteHelper(root.left, val);
        } else if (val > root.val) {
            root.right = deleteHelper(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.val = findMin(root.right);
            root.right = deleteHelper(root.right, root.val);
        }
        return root;
    }

    private int findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public void inOrderTraversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderHelper(root.left);
        System.out.print(root.val + " ");
        inOrderHelper(root.right);
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inOrderTraversal();
        System.out.println();
        tree.delete(20);
        tree.delete(40);
        tree.inOrderTraversal();
    }
}
