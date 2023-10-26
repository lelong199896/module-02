package BinarySearchTree;

import java.util.Locale;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNote<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNote<E> parent = null;
            TreeNote<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }
    protected TreeNote<E> createNewNode(E e) {
        return new TreeNote<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }
    protected void inorder(TreeNote<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.element + "");
        inorder(root.right);
    }

    @Override
    public void postorder() {
        postorder(root);
    }
    protected void postorder(TreeNote<E> root) {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }

    @Override
    public void preorder() {
        preorder(root);
    }
    protected void preorder(TreeNote<E> root) {
        if (root == null) return;
        System.out.println(root.element + "");
        preorder(root.left);
        preorder(root.right);
    }

    public boolean delete(E e) {
        TreeNote<E> parent = null;
        TreeNote<E> current = root;
        while (current != null) {
            int compare = e.compareTo(current.element);
            if (compare == 0) {
                break;
            }
            parent = current;
            if (compare < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return false;
        }
        if (current.left == null) {
            replaceNode(parent, current, current.left);
        } else {
            TreeNote<E> min = findMin(current.right);
            current.element = min.element;
            deleteMin(current);
        }
        size--;
        return true;
    }

    private void replaceNode(TreeNote<E> parent, TreeNote<E> current, TreeNote<E> newNode) {
        if (parent == null) {
            root = newNode;
        } else if (current == parent.left) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    private TreeNote<E> findMin(TreeNote<E> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private void deleteMin(TreeNote<E> node) {
        while (node.right != null) {
//            TreeNote<E> parent = node;
            node = node.right;
        }
    }
}
