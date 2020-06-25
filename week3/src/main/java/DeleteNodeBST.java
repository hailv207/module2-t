import java.util.Scanner;

public class DeleteNodeBST {
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
        System.out.println("Original tree:");
        preOrder(integerBST.root);
        System.out.println("Please enter the value you want to delete:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        delete(integerBST, value);
        System.out.println("Tree after deleting:");
        preOrder(integerBST.root);

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

    public static void delete(BST tree, int value) {
        TreeNode<Integer> root = tree.root;
        TreeNode<Integer> node = getNodeByValue(root, value);
        if (node == null) {
            System.out.println("Value was not found.");
            return;
        }
        if (node == root) {
            if (node.left != null && node.right != null) {
                TreeNode<Integer> leftMostNode = getLeftMostNode(root.right);
                TreeNode<Integer> parent = getParentNode(root, leftMostNode.element);
                if (parent.element > leftMostNode.element) {
                    parent.left = leftMostNode.right;
                } else {
                    parent.right = leftMostNode.right;
                }
                leftMostNode.right = node.right;
                leftMostNode.left = node.left;
                tree.root = leftMostNode;
                return;
            }
            if (node.left == null && node.right != null) {
                tree.root = node.right;
                return;
            }
            if (node.left != null && node.right == null) {
                tree.root = node.left;
                return;
            }
            if (node.left == null && node.right == null) {
                tree.root = null;
                return;
            }
        }
        if (node.left == null && node.right != null) {
            TreeNode<Integer> parent = getParentNode(root, value);
            if (parent.element > value) {
                parent.left = node.right;
                return;
            } else {
                parent.right = node.right;
                return;
            }
        }
        if (node.right == null && node.left != null) {
            TreeNode<Integer> parent = getParentNode(root, value);
            if (parent.element > value) {
                parent.left = node.left;
                return;
            } else {
                parent.right = node.left;
                return;
            }
        }
        if (node.right == null && node.left == null) {
            TreeNode<Integer> parent = getParentNode(root, value);
            if (parent.element > value) {
                parent.left = null;
                return;
            } else {
                parent.right = null;
                return;
            }
        }
        if (node.right != null && node.left != null) {
            TreeNode<Integer> currentParent = getParentNode(root, value);
            TreeNode<Integer> leftMostNode = getLeftMostNode(node.right);
            TreeNode<Integer> leftMostParent = getParentNode(root, leftMostNode.element);
            leftMostNode.left = node.left;
            leftMostNode.right = node.right;
            if (currentParent.element > value) {
                currentParent.left = leftMostNode;
            } else {
                currentParent.right = leftMostNode;
            }
            if (leftMostParent.element > leftMostNode.element) {
                leftMostParent.left = null;
            } else {
                leftMostParent.right = null;
            }
            return;
        }
    }


    public static TreeNode getParentNode(TreeNode<Integer> node, int value) {
        while (node != null) {
            if (node.left.element == value) {
                return node;
            } else if (node.right.element == value) {
                return node;
            } else if (node.element > value) {
                node = node.left;
                getParentNode(node, value);
            } else {
                node = node.right;
                getParentNode(node, value);
            }
        }
        throw new IndexOutOfBoundsException("Invalid value.");
    }

    public static TreeNode getNodeByValue(TreeNode<Integer> node, int value) {
        while (node != null) {
            if (node.element.compareTo(value) > 0) {
                node = node.left;
            } else if (node.element.compareTo(value) < 0) {
                node = node.right;
            } else {
                return node;
            }
        }
        return null;
    }

    public static TreeNode getLeftMostNode(TreeNode node) {
        while (node != null) {
            if (node.left != null) {
                node = node.left;
            } else {
                return node;
            }
        }
        return node;
    }

//    public static TreeNode getRightMostNode(TreeNode node) {
//        while (node != null) {
//            if (node.right != null) {
//                node = node.right;
//            } else {
//                return node;
//            }
//        }
//        return node;
//    }
}
