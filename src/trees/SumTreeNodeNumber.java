package trees;

/**
* description: 计算二叉树中的节点数量
* @author: valarchie
* on: 2020/5/2
* @email: 343928303@qq.com
*/
public class SumTreeNodeNumber {


    public static void main(String[] args) {

        int number = calculateTreeNodeNumber(TestTreeData.TEST_TREE_1);

        System.out.println(number);

    }


    /**
     * 利用递归进行累加
     * @param treeNode
     * @return
     */
    public static int calculateTreeNodeNumber(TreeNode treeNode) {

        if (treeNode == null) {
            return 0;
        }

        return calculateTreeNodeNumber(treeNode.left) + calculateTreeNodeNumber(treeNode.right) + 1;

    }


}