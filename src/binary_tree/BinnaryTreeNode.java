package binary_tree;import java.lang.Comparable;import java.lang.Integer;import java.lang.Object;import java.lang.Override; /**
 * Created by Рустам on 13.10.2015.
 */
public class BinnaryTreeNode<E> implements Comparable {
    private E data;
    private BinaryTree parent;
    private BinaryTree left;
    private BinaryTree right;
    private int height = 0;

    public BinnaryTreeNode(E data){
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BinaryTree getParent() {
        return parent;
    }

    public void setParent(BinaryTree parent) {
        this.parent = parent;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public int compareTo(Object o) {
        BinnaryTreeNode entry = (BinnaryTreeNode)o;
        if(entry.getData() instanceof Integer){
            if (((Integer)this.getData() > (Integer)entry.getData())){
                return 1;
            }else {

            }
         //   return  : 1


        }
        return 0;
    }
}
