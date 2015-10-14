import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Stack;

/**
 * Created by Рустам on 13.10.2015.
 */
public class MyTree<E> implements Visitor{
    public ArrayList<E> tree;
    public Stack<Integer> stack = new Stack<>();

    private int degree;
    private int height;

    public MyTree(int degree){
        this.degree = degree;
        tree = new ArrayList<>();
            tree.add(null);
        height = 0;
    }

    public int get(int indexOfParent, int indexOfNode){
        if(tree.get(0) != null){
            return degree * indexOfParent + indexOfNode + 1;
        }
        return -1;
    }

    public int getParent(int indexOfNode){
        return ((degree + 1) - 2)/degree - 1;
    }

    public int sizeOfTree(){
        return tree.size();
    }


    /**
     *
     * @param data
     * @param indexOfNode in the array
     */
    public void addChild(E data, int indexOfNode){
        if(indexOfNode > elementsCount(height + 1)) {
            throw new ArrayIndexOutOfBoundsException("Out of tree");
        }

        if(indexOfNode >= elementsCount(height)){
            resize();
        }
        tree.set(indexOfNode, data);
    }

    /**
     * Count number of elements via height of tree.
     * Geometric progression
     * @param height
     * @return
     */
    public int elementsCount(int height){
        return (int) (Math.pow(degree,(height+ 1)) - 1) / (degree - 1);
    }

    /**
     * increase array size
     */
    private void resize() {
        int increaseSize =  elementsCount(height + 1) - elementsCount(height);
        height++;
        for (int i = 0; i < increaseSize; i++){
            tree.add(null);
        }
    }

    public void traversePostorder() throws IllegalStateException{
        if(tree.get(0) == null){
            throw new IllegalStateException("Tree is empty");
        }
        traversePostorder(0);
    }

    private void traversePostorder(int i){
        if(i< elementsCount(height - 1)) {
            for (int j = 0; j < degree; j++) {
                traversePostorder(get(i, j));
            }
        }
        visit(i);
    }

    public void traversePreorder() throws IllegalStateException{
        if(tree.get(0) == null){
            throw new IllegalStateException("Tree is empty");
        }
        traversePreorder(0);
    }

    private void traversePreorder(int i){
        visit(i);
        if(i< elementsCount(height - 1)) {
            for (int j = 0; j < degree; j++) {
                traversePreorder(get(i, j));
            }
        }

    }

    @Override
    public <E> void visit(int index) {
        E value = (E)tree.get(index);
        if (value != null){
            System.out.println(value.toString());
        }
    }

//    public void calculate(){
//
//        if (value instanceof Integer ){
//            stack.push((Integer) value);
//        }else {
//            int second = stack.pop();
//            int first = stack.pop();
//
//            if (value.equals("*")){
//                stack.push(first * second);
//            }else
//            if(value.equals("-")){
//                stack.push(first - second);
//            }
//            else
//            if(value.equals("+")){
//                stack.push(first + second);
//            }
//            else {
//                System.out.println("INcorrect sym");
//            }
//        }
//    }


}
