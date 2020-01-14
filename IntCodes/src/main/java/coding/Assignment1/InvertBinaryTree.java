package coding.Assignment1;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    public static void main(String[] args) {

        // root node
        TreeNode<Integer> root  = new TreeNode<Integer>(1);

        // children of root
        root.left               = new TreeNode<Integer>(2);
        root.right              = new TreeNode<Integer>(3);

//        // grand left children of root
//        root.left.left          = new TreeNode<Integer>(7);
//        root.left.right         = new TreeNode<Integer>(3);
//
//        // grand right childrend of root
//        root.right.left         = new TreeNode<Integer>(8);
//        root.right.right        = new TreeNode<Integer>(1);

        System.out.println("Before invert");
        traverseTree(root);

        reverseTree(root);

        System.out.println("\nAfter invert");
        traverseTree(root);
    }

    // helper method
    private static void reverseTree(TreeNode<Integer> root) {
        reverseTreeNode(root);
    }

    private static void reverseTreeNode(TreeNode<Integer> node) {
        TreeNode<Integer> temp = node.left;
        node.left   = node.right;
        node.right  = temp;

        if(node.left != null)
            reverseTreeNode(node.left);

        if(node.right != null)
            reverseTreeNode(node.right);
    }

    // helper method for traverse
    private static void traverseTree(TreeNode<Integer> root) {
        Queue<Integer> leftChildren     = new LinkedList<Integer>();
        Queue<Integer> rightChildren    = new LinkedList<Integer>();

        traverseTreeNode(root, leftChildren, rightChildren);

        System.out.println("Tree;\n*****");

        System.out.printf("%3d\n", root.value);

        int count = 0;
        int div = 0;
        while(!(leftChildren.isEmpty() && rightChildren.isEmpty())) {
            System.out.printf("%3d\t%3d\t", leftChildren.poll(), rightChildren.poll());
            count += 2;
            div++;
            if( (double)count == (Math.pow(2, div))) {
                System.out.println();
                count = 0;
            }
        }

        System.out.println();
    }

    private static void traverseTreeNode(TreeNode<Integer> node, Queue<Integer> leftChildren, Queue<Integer> rightChildren) {
        if(node.left != null)
            leftChildren.offer(node.left.value);

        if(node.right != null)
            rightChildren.offer(node.right.value);

        if(node.left != null) {
            traverseTreeNode(node.left, leftChildren, rightChildren);
        }

        if(node.right != null) {
            traverseTreeNode(node.right, leftChildren, rightChildren);
        }
    }

    private static class TreeNode<E extends Comparable<E>> {

        protected E value;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

}