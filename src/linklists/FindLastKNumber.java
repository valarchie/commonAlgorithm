package linklists;

/**
* description: 移除链表中导数第N个数字
* @author: valarchie
* on: 2020/5/1
* @email: 343928303@qq.com
*/
public class FindLastKNumber {


    public static void main(String[] args) {

        // 初始化测试链表
        LinkNode n1 = new LinkNode(1);
        LinkNode n2 = new LinkNode(2);
        LinkNode n3 = new LinkNode(3);
        LinkNode n4 = new LinkNode(4);
        LinkNode n5 = new LinkNode(5);
        LinkNode n6 = new LinkNode(6);
        LinkNode n7 = new LinkNode(7);
        LinkNode n8 = new LinkNode(8);

        n1.setNext(n2).setNext(n3).setNext(n4).setNext(n5).setNext(n6).setNext(n7).setNext(n8);

        // 获取倒数第二个数字
        LinkNode lastKNumber = findLastKNumber(n1, 3);

        System.out.println(lastKNumber.value);

    }


    /**
     * 移除链表中导数第k个数字，准备两个指针，一个快指针先走k步，
     * 然后再启动另一个慢指针，快指针到达链表末尾时，慢指针即为导数第k个数字
     * @param node
     * @param k 导数第k个数字
     */
    public static LinkNode findLastKNumber(LinkNode node, int k) {

        LinkNode fast = node;
        LinkNode slow = node;

        for (int i = 0; i < k; i++) {
            // 如果fast为空的话，说明k超出范围
            if (fast == null) {
                throw new RuntimeException("超出链表范围！");
            }

            fast = fast.next;

        }

        while (fast != null) {

            fast = fast.next;
            slow = slow.next;

        }

        return slow;

    }



}