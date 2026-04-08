public class Test {

    public static void main(String[] args){
        
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

        tree.add(8);
        tree.add(5);
        tree.add(2);
        tree.add(7);
        tree.add(15);
        tree.add(12);
        tree.add(29);

        System.out.println(tree);
        
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
