package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PrintTreeByZ {


    public static void main(String[] args) {

        printByZ(TestTreeData.TEST_TREE_3);

    }




    /**
     * 利用两个队列，一个队列正序打印，一个队列逆序打印
     * @param tree
     */
    public static void printByZ(TreeNode tree) {

        if (tree == null) {
            return;
        }

        List<TreeNode> orderQueue = new ArrayList<>();

        List<TreeNode> disorderQueue = new ArrayList<>();

        orderQueue.add(tree);

        while (!orderQueue.isEmpty()|| !disorderQueue.isEmpty()) {


            if (!orderQueue.isEmpty()) {

                for (int i = 0; i < orderQueue.size(); i++) {

                    TreeNode leaf = orderQueue.get(i);

                    if (leaf.left != null) {
                        disorderQueue.add(leaf.left);
                    }

                    if (leaf.right != null) {
                        disorderQueue.add(leaf.right);
                    }


                }

                for (TreeNode node : orderQueue) {
                    System.out.println(node.val);
                }

                orderQueue.clear();
                
            }


            if (!disorderQueue.isEmpty()) {

                for (int i = 0; i < disorderQueue.size(); i++) {

                    TreeNode leaf = disorderQueue.get(i);

                    if (leaf.left != null) {
                        orderQueue.add(leaf.left);
                    }

                    if (leaf.right != null) {
                        orderQueue.add(leaf.right);
                    }

                }

                for (int i = disorderQueue.size()-1; i >=0 ; i--) {

                    TreeNode leaf = disorderQueue.get(i);
                    System.out.println(leaf.val);

                }
                disorderQueue.clear();

            }


        }

    }

}