package trees;

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