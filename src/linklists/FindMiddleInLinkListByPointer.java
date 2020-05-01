package linklists;

import java.util.concurrent.locks.ReentrantLock;

/**
 * description: 获取链表的中点，采用快慢指针
 *
 * @author: valarchie
 * on: 2020/4/29
 * @email: 343928303@qq.com
 */
public class FindMiddleInLinkListByPointer {

    private static Integer middleIndex;


    public static void main(String[] args) {


//        printLinkNodes(TEST_LINK_4);
//
//        LinkNode middleByPointer = findMiddleByPointer(TEST_LINK_4);
//
//        printLinkNode(middleByPointer);


        Integer middleIndex = new Integer(0);

        findMiddleByRecursion(LinkNodeTestData.TEST_LINK_1, 1);


    }


    /**
     * 采用快慢指针，当快指针的为null时说明慢指针抵达中点
     *
     * @param node
     * @return
     */
    public static LinkNode findMiddleByPointer(LinkNode node) {

        LinkNode slow = node;
        LinkNode fast = node;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;

            fast = fast.next.next;

        }

        return slow;

    }


    /**
     * 递归方式去寻找链表的中点
     *
     * @param node
     * @return
     */
    public static void findMiddleByRecursion(LinkNode node, int recursionIndex) {

        if (node.next != null) {
            findMiddleByRecursion(node.next, recursionIndex + 1);
        } else {
            middleIndex = recursionIndex % 2 == 0 ? recursionIndex / 2 : recursionIndex / 2 + 1;
        }

        if (middleIndex == recursionIndex) {
            System.out.println(node.value);
        }

        return;

    }


}