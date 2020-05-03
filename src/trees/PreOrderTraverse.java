package trees;

import java.util.Stack;

/**
* description: 前序遍历
* @author: valarchie
* on: 2020/5/3
* @email: 343928303@qq.com
*/
public class PreOrderTraverse {


    public static void main(String[] args) {

        preOrderNonRecursion(TestTreeData.TEST_TREE_1);

    }


    /**
     * 前序递归遍历树
     * @param tree
     */
    public static void preOrderRecursion(TreeNode tree) {

        if (tree != null) {
            System.out.print(tree.val + "->");
            preOrderRecursion(tree.left);
            preOrderRecursion(tree.right);
        }

    }


    /**
     * 前序非递归遍历树
     * @param tree
     */
    public static void preOrderNonRecursion(TreeNode tree) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = tree;
        while (node != null || !stack.empty()) {
            if (node != null) {
                System.out.print(node.val + "->");
                stack.push(node);
                node = node.left;
            } else {
                TreeNode tem = stack.pop();
                node = tem.right;
            }
        }
    }


}