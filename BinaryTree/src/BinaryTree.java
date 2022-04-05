import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> implements IBinaryTree<E>{

    BinaryTreeNode<E> root;

    public BinaryTree(){
        this.root=null;
    }


    @Override
    public BinaryTreeNode<E> getRoot() {
        return root;
    }

    @Override
    public void setRoot(BinaryTreeNode<E> newRoot) {
        this.root=newRoot;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size(BinaryTreeNode<E> node) {
        if(node==null)
            return 0;
        else
            return (size(node.getLeftChild())+1+size(node.getRightChild()));
    }

    @Override
    public boolean contains(BinaryTreeNode<E> node,E element) {
        if (node.getElement() == element) {
            return true;
        }

        boolean contains = false;
        if (node.getLeftChild()!=null) {
            contains = contains(node.getLeftChild(), element);
        }
        if (!contains && node.getRightChild()!=null) {
            contains = contains(node.getRightChild(), element);
        }

        return contains;
    }

    @Override
    public ArrayList<E> inOrder(BinaryTreeNode<E> node) {
        ArrayList<E> orderedTree=new ArrayList<>();
        if (node == null) {
            return null;
        }

        inOrder(node.getLeftChild());
        orderedTree.add(node.element);
        inOrder(node.getRightChild());

        return orderedTree;
    }

    @Override
    public ArrayList<E> preOrder(BinaryTreeNode<E> node) {
        ArrayList<E> orderedTree=new ArrayList<>();
        if (node == null) {
            return null;
        }
        orderedTree.add(node.element);
        preOrder(node.getLeftChild());
        preOrder(node.getRightChild());

        return orderedTree;
    }

    @Override
    public ArrayList<E> postOrder(BinaryTreeNode<E> node) {
        ArrayList<E> orderedTree=new ArrayList<>();
        if (node == null) {
            return null;
        }

        // traverse the left child
        postOrder(node.getLeftChild());
        // traverse the right child
        postOrder(node.getRightChild());

        return orderedTree;
    }

    @Override
    public ArrayList<E> levelOrder(BinaryTreeNode<E> node) {
        ArrayList<E> orderedTree = new ArrayList<>();
        Queue<BinaryTreeNode<E>> queue=new LinkedList<BinaryTreeNode<E>>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            BinaryTreeNode<E> tempNode=queue.poll();
            orderedTree.add(tempNode.getElement());
            if(tempNode.getLeftChild()!=null)
                queue.add(tempNode.getLeftChild());
            if(tempNode.getRightChild()!=null)
                queue.add(tempNode.getRightChild());
        }

        return orderedTree;
    }
    @Override
    public int height(BinaryTreeNode<E> temp) {
        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        } else {
            int leftHeight = 0, rightHeight = 0;

            //Calculate the height of left subtree
            if (temp.getLeftChild() != null)
                leftHeight = height(temp.getLeftChild());

            //Calculate the height of right subtree
            if (temp.getRightChild() != null)
                rightHeight = height(temp.rightChild);

            //Compare height of left subtree and right subtree
            //and store maximum of two in variable max
            int max = Math.max(leftHeight, rightHeight);

            //Calculate the total height of tree by adding height of root
            return (max + 1);
        }
    }
}
