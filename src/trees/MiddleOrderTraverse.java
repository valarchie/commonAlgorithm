package trees;

import java.util.Stack;

/**
* description: 中序遍历
* @author: valarchie
* on: 2020/5/3
* @email: 343928303@qq.com
*/
public class MiddleOrderTraverse {


    public static void main(String[] args) {

        middleOrderRecursion(TestTreeData.TEST_TREE_1);
        System.out.println();
        middleOrderNonRecursion(TestTreeData.TEST_TREE_1);

    }


    /**
     * 中序递归遍历树
     * @param tree
     */
    public static void middleOrderRecursion(TreeNode tree) {

        if (tree != null) {
            middleOrderRecursion(tree.left);
            System.out.print(tree.val + "->");
            middleOrderRecursion(tree.right);
        }

    }



    /**
     * 中序非递归遍历树
     * @param tree
     */
    public static void middleOrderNonRecursion(TreeNode tree) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = tree;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                System.out.print(tem.val + "->");
                node = tem.right;
            }
        }

    }



}