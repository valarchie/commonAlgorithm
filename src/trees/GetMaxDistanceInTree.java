package trees;

/**
* description: 获取树的最大距离
* @author: valarchie
* on: 2020/5/4
* @email: 343928303@qq.com
*/
public class GetMaxDistanceInTree {

    public static void main(String[] args) {

    }


    public static int getMaxDistance(TreeNode tree) {

        if (tree == null) {
            return 0;
        }

        int withRoot = getMaxDistance(tree);
        int withoutRoot = getMaxDistance(tree);

        return 0;

    }


}