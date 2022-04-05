import java.util.ArrayList;

public interface IBinaryTree<E> {
    BinaryTreeNode<E> getRoot();
    void setRoot(BinaryTreeNode<E> newRoot);
    boolean isEmpty();
    int size(BinaryTreeNode<E> node);
    boolean contains(BinaryTreeNode<E> node,E element);
    ArrayList<E> inOrder(BinaryTreeNode<E> node);
    ArrayList<E> preOrder(BinaryTreeNode<E> node);
    ArrayList<E> postOrder(BinaryTreeNode<E> node);
    ArrayList<E> levelOrder(BinaryTreeNode<E> node);
    int height(BinaryTreeNode<E> node);

}
