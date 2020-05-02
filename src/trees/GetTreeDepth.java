package trees;

/**
* description: 获取树的深度
* @author: valarchie
* on: 2020/5/2
* @email: 343928303@qq.com
*/
public class GetTreeDepth {

    public static void main(String[] args) {

        int treeDepth = getTreeDepth(TestTreeData.TEST_TREE_2);

        System.out.println(treeDepth);

    }


    /**
     * 递归计算树的深度
     * @param tree
     * @return
     */
    public static int getTreeDepth(TreeNode tree) {

        if (tree == null) {
            return 0;
        }

        int left = getTreeDepth(tree.left);
        int right = getTreeDepth(tree.right);

        return left >= right ? left + 1 : right + 1;

    }




}