package BinarySearchTree;

public class BinarySearchTree {
    public static void main(String[] args) {
        BST<String> tree = new BST<String>();
        tree.insert("5");
        tree.insert("6");
        tree.insert("3");
        tree.insert("2");
        tree.insert("1");
        tree.insert("7");
        tree.insert("4");

        System.out.println("inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println("\nPostorder (sorted): ");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println("\npreorder (sorted): ");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
