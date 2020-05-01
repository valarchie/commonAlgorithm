package linklists;

/**
* description: 利用指针进行翻转链表
* @author: valarchie
* on: 2020/5/1
* @email: 343928303@qq.com
*/
public class ReverseLinkListByPointer{


    public static void main(String[] args) {

        // 初始化测试链表
        LinkNode l1 = new LinkNode(1);
        LinkNode l2 = new LinkNode(2);
        LinkNode l3 = new LinkNode(3);
        LinkNode l4 = new LinkNode(4);
        LinkNode l5 = new LinkNode(5);

        l1.setNext(l2).setNext(l3).setNext(l4).setNext(l5);

        reverseLinkListByPointer(l1);

        l5.printList();


    }


    /**
     * 利用三个指针分别保存当前，下一个，和下下个的链表节点
     * @param node
     */
    public static void reverseLinkListByPointer(LinkNode node) {

        LinkNode cur = node;
        LinkNode next = node.next;
        LinkNode nextNext = null;

        cur.next = null;

        while (next != null) {

            nextNext = next.next;
            next.next = cur;
            cur = next;
            next = nextNext;

        }


    }


}