public interface IBinaryTreeNode <E>{
    void setElement(E element);
    E getElement();
    void addLeftChild(BinaryTreeNode<E> binaryTreeNode);
    void addRightChild(BinaryTreeNode<E> binaryTreeNode);
    BinaryTreeNode<E> getLeftChild();
    BinaryTreeNode<E> getRightChild();

}
