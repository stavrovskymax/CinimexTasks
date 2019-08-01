package binarytree;

public class BinaryTreeTask {
    public static Node root;

    public static void addNode(Node root, int val) {
        Node node;

        if (root.val < val) {
            if (root.right == null) {
                node = new Node();
                node.val = val;
                root.right = node;
            } else {
                addNode(root.right, val);
            }
        } else {
            if (root.left == null) {
                node = new Node();
                node.val = val;
                root.left = node;
            } else {
                addNode(root.left, val);
            }
        }
    }

    public static void arrayToBinaryTree(int[] array) {
        root = new Node();
        root.val = array[0];
        for (int i = 1; i < array.length; i++) {
            addNode(root, array[i]);
        }
    }

    public static int sumBinaryTree(Node root) {
        int left, right;

        if (root == null) {
            return 0;
        }

        left = sumBinaryTree(root.left);
        right = sumBinaryTree(root.right);
        return left + root.val + right;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 1, 8, 1, -1, 9, 3, 14, -1};
        BinaryTreeTask.arrayToBinaryTree(array);
        System.out.println("sum = " + BinaryTreeTask.sumBinaryTree(BinaryTreeTask.root));
    }
}
