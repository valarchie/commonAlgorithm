package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
* description: 层次遍历二叉树
* @author: valarchie
* on: 2020/5/2
* @email: 343928303@qq.com
*/
public class PrintTreeByLevel {

    public static void main(String[] args) {

        printByLevel(TestTreeData.TEST_TREE_1);

    }


    /**
     * 利用队列
     * @param tree
     */
    public static void printByLevel(TreeNode tree) {

        if (tree == null) {
            return;
        }

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(tree);

        while (!queue.isEmpty()) {

            TreeNode pop = queue.pop();

            System.out.println(pop.val);

            if (pop.left != null) {
                queue.add(pop.left);
            }

            if (pop.right != null) {
                queue.add(pop.right);
            }

        }

    }


}