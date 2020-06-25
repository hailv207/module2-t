
public class PostOrderBSTTest {
    public static void main(String[] args) {
        BST<Integer> integerBST = new BST<>();
        integerBST.insert(60);
        integerBST.insert(55);
        integerBST.insert(100);
        integerBST.insert(45);
        integerBST.insert(57);
        integerBST.insert(67);
        integerBST.insert(107);
        integerBST.insert(59);
        integerBST.insert(101);
        System.out.println("PostOder:");
        postOrder(integerBST.root);
        System.out.println("PreOrder:");
        preOrder(integerBST.root);
        System.out.println("InOder:");
        inOder(integerBST.root);
    }

    public static void postOrder(TreeNode node) {
        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        System.out.println(node.element);
    }

    public static void preOrder(TreeNode node) {
        System.out.println(node.element);
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }

    }

    public static void inOder(TreeNode node) {
        if (node.left != null) {
            inOder(node.left);
        }
        System.out.println(node.element);
        if (node.right != null) {
            inOder(node.right);
        }

    }

}
