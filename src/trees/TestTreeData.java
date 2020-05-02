package trees;

/**
* description: 生成供测试的二叉树
* @author: valarchie
* on: 2020/5/2
* @email: 343928303@qq.com
*/
public class TestTreeData {

    public static TreeNode TEST_TREE_1;

    public static TreeNode TEST_TREE_2;

    public static TreeNode TEST_TREE_3;

    static {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;

        n4.left = n2;
        n4.right = n6;

        TEST_TREE_1 = n4;
    }


    static {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;
        n7.right = n8;

        n4.left = n2;
        n4.right = n6;

        TEST_TREE_2 = n4;

    }



    static {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;

        n4.left = n2;
        n4.right = n6;

        TreeNode n8 = new TreeNode(8);


        TreeNode n9 = new TreeNode(9);
        TreeNode n10 = new TreeNode(10);
        TreeNode n11 = new TreeNode(11);
        TreeNode n12 = new TreeNode(12);
        TreeNode n13 = new TreeNode(13);
        TreeNode n14 = new TreeNode(14);
        TreeNode n15 = new TreeNode(15);

        n10.left = n9;
        n10.right = n11;

        n14.left = n13;
        n14.right = n15;

        n12.left = n10;
        n12.right = n14;

        n8.left = n4;
        n8.right = n12;

        TEST_TREE_3 = n8;



    }

}
