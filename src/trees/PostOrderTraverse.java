package trees;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

/**
* description: 后序遍历
* @author: valarchie
* on: 2020/5/3
* @email: 343928303@qq.com
*/
public class PostOrderTraverse {

    public static void main(String[] args) {

//        postOrderTraverseRecursion(TestTreeData.TEST_TREE_1);
//        System.out.println();
//        postOrderTraverseNonRecursion(TestTreeData.TEST_TREE_1);
//        System.out.println();
        postOrderTraverseNonRecursion1(TestTreeData.TEST_TREE_1);

    }

    /**
     * 递归后序遍历
     * @param root
     */
    public static void postOrderTraverseRecursion(TreeNode root) {
        if (root != null) {
            postOrderTraverseRecursion(root.left);
            postOrderTraverseRecursion(root.right);
            System.out.print(root.val + "->");
        }
    }


    /**
     * 非递归后序遍历
     * @param root
     */
    public static void postOrderTraverseNonRecursion(TreeNode root) {
        TreeNode cur, pre = null;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            cur = stack.peek();
            if ((cur.left == null && cur.right == null) || (pre != null && (pre == cur.left || pre == cur.right))) {
                System.out.print(cur.val + "->");
                stack.pop();
                pre = cur;
            } else {

                if (cur.right != null){
                    stack.push(cur.right);
                }


                if (cur.left != null){
                    stack.push(cur.left);
                }

            }
        }
    }


    /**
     * 采用两个链表
     * @param root
     */
    public static void postOrderTraverseNonRecursion1(TreeNode root) {

        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<TreeNode> output = new LinkedList<>();
        if (root == null) {
            return;
        }

        stack.add(root);
        while (!stack.isEmpty()) {

            TreeNode node = stack.pollLast();
            output.addFirst(node);

            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }

        for (TreeNode node : output) {
            System.out.print(node.val + "->");
        }

    }





}