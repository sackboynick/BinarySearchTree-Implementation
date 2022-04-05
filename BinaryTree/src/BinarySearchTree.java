import java.util.ArrayList;

public class BinarySearchTree<E> implements IBinarySearchTree<E>{
    @Override
    public boolean insert(E element) {
        return false;
    }

    @Override
    public boolean removeElement(E element) {
        return false;
    }

    @Override
    public E findMin() {
        return null;
    }

    @Override
    public E findMax() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public void rebalance() {

    }

    @Override
    public BinaryTreeNode<E> getRoot() {
        return null;
    }

    @Override
    public void setRoot(BinaryTreeNode<E> newRoot) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size(BinaryTreeNode<E> node) {
        return 0;
    }

    @Override
    public boolean contains(BinaryTreeNode<E> node, E element) {
        return false;
    }

    @Override
    public ArrayList<E> inOrder(BinaryTreeNode<E> node) {
        return null;
    }

    @Override
    public ArrayList<E> preOrder(BinaryTreeNode<E> node) {
        return null;
    }

    @Override
    public ArrayList<E> postOrder(BinaryTreeNode<E> node) {
        return null;
    }

    @Override
    public ArrayList<E> levelOrder(BinaryTreeNode<E> node) {
        return null;
    }

    @Override
    public int height() {
        return 0;
    }
}
