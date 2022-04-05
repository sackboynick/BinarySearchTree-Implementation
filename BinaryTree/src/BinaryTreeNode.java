public class BinaryTreeNode<E> implements IBinaryTreeNode<E>{
    E element;
    BinaryTreeNode<E> leftChild;
    BinaryTreeNode<E> rightChild;

    public BinaryTreeNode(E element){
        this.element=element;
    }

    @Override
    public void setElement(E element) {
        this.element=element;
    }

    @Override
    public E getElement() {
        return element;
    }

    @Override
    public void addLeftChild(BinaryTreeNode<E> binaryTreeNode) {
        this.leftChild=binaryTreeNode;
    }

    @Override
    public void addRightChild(BinaryTreeNode<E> binaryTreeNode) {
        this.rightChild=binaryTreeNode;
    }

    @Override
    public BinaryTreeNode<E> getLeftChild() {
        return leftChild;
    }

    @Override
    public BinaryTreeNode<E> getRightChild() {
        return rightChild;
    }
}
