/**
 * Created by Рустам on 13.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        int degree = 3;
        MyTree tree;// = new MyTree(degree);
 //       tree.addChild("+", 0);
 //       tree.addChild(20, tree.get(0, 0));

//
//        int c = tree.get(0, 1);
//        tree.addChild("-", c);
//        tree.addChild(15, tree.get(c, 0));
//        tree.addChild("*", tree.get(c, 1));
//        c = tree.get(c, 1);
//        tree.addChild(10, tree.get(c, 0));
//        tree.addChild(29, tree.get(c, 1));
//
//        tree.traversePostorder();
//        System.out.println("result = " + tree.stack.pop());

        Parser parser = new Parser();
        tree = parser.parse("20 + 15 - 10 * 29 -    1");

        tree.traversePostorder();

        System.out.println("____________________");
//        System.out.println(tree.stack.pop());

        tree.traversePreorder();


    }
}
