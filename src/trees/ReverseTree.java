package trees;

/**
* description: 将二叉树的排序颠倒
* @author: valarchie
* on: 2020/5/2
* @email: 343928303@qq.com
*/
public class ReverseTree {

    public static void main(String[] args) {

        reverse(TestTreeData.TEST_TREE_1);
        PrintTreeByLevel.printByLevel(TestTreeData.TEST_TREE_1);

    }


    /**
     * 递归交换左右子树即可
     * @param tree
     */
    public static void reverse(TreeNode tree) {

        if (tree.left == null && tree.right == null) {
            return;
        }

        TreeNode tmp = tree.right;

        tree.right = tree.left;
        tree.left = tmp;

        reverse(tree.left);
        reverse(tree.right);

    }


}



