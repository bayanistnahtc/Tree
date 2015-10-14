package binary_tree;import java.lang.Override; /**
 * Created by Рустам on 13.10.2015.
 */
public class BinaryTree<E> implements BinaryTreeInterface {
    private BinnaryTreeNode<E> root = null;
    private int size = 0;
    private int height = -1;


    public BinnaryTreeNode<E> getRoot() {
        return root;
    }

    public void setRoot(BinnaryTreeNode<E> root) {
        this.root = root;
        height++;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    @Override
    public int find() {
        return 0;
    }


    public boolean add(E elem){
        if(isEmpty()){
            root = new BinnaryTreeNode(elem);
        }else {
           // if(elem > root.getData())
        }
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
