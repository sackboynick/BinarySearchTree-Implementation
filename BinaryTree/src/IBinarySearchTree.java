public interface IBinarySearchTree<E> extends IBinaryTree<E>{
    boolean insert(E element);
    boolean removeElement(E element);
    E findMin();
    E findMax();
    boolean contains(E element);
    void rebalance();
}
