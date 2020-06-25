import java.util.Scanner;

public class SearchInBST {
    public static void main(String[] args) {
        BST<Integer> integerBST = new BST<>();
        integerBST.insert(100);
        integerBST.insert(76);
        integerBST.insert(84);
        integerBST.insert(321);
        integerBST.insert(124);
        integerBST.insert(542);
        integerBST.insert(24);
        integerBST.insert(67);
        integerBST.insert(221);
        integerBST.insert(45);
        integerBST.insert(324);
        integerBST.insert(322);
        integerBST.insert(123);
        integerBST.insert(99);
        integerBST.insert(1);
        integerBST.insert(654);

        System.out.println("Enter a search value:");
        Scanner scanner = new Scanner(System.in);
        int searchValue = scanner.nextInt();
        TreeNode<Integer> current = integerBST.root;
        boolean isFound = false;
        while (current != null) {
            if (current.element.compareTo(searchValue) > 0) {
                current = current.left;
            } else if (current.element.compareTo(searchValue) < 0) {
                current = current.right;
            } else {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.printf("The search value: %d is contained in the tree. \n", searchValue);
        } else {
            System.out.printf("The search value: %d is not contained in the tree.\n", searchValue);
        }

    }
}
