import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Рустам on 13.10.2015.
 */
public class  Parser <E> {

    public MyTree parse(String expression){
        MyTree tree = new MyTree(2);
        Stack<E> stack = new Stack<>();
        Stack<E> op = new Stack<>();
        Scanner scanner = new Scanner(expression);
        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                stack.push((E)((Integer)scanner.nextInt()));

            }else {
                op.push((E)scanner.next());
            }
        }

        while (op.size()!=0) {
            stack.push(op.pop());
        }

        int c = 0;
        int s = tree.sizeOfTree();
        while (stack.size() != 0){

            if(s == 1) {
                tree.addChild(stack.pop(), 0);
                s++;
            }else {
                c = tree.get(c, 1);
                tree.addChild(stack.pop(), c);
            }
           // System.out.println(tree.sizeOfTree());
        }


        return tree;
    }

    public static boolean checkString(String string) {
        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }


}
