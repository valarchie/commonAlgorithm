package linklists;

/**
* description: 反转链表采用递归方式
* @author: valarchie
* on: 2020/5/1
* @email: 343928303@qq.com
*/
public class ReverseLinkListByRecursion{


    public static void main(String[] args) {

        // 初始化测试链表
        LinkNode n1 = new LinkNode(5);
        LinkNode n2 = new LinkNode(4);
        LinkNode n3 = new LinkNode(3);
        LinkNode n4 = new LinkNode(2);
        LinkNode n5 = new LinkNode(1);

        n1.setNext(n2).setNext(n3).setNext(n4).setNext(n5);

        reverseLinkListByRecursion(n1, n1.next);

        n5.printList();

    }


    public static void reverseLinkListByRecursion(LinkNode cur, LinkNode next) {

        if (next == null) {
            return;
        }

        reverseLinkListByRecursion(next, next.next);
        next.next = cur;
        cur.next = null;

        return;

    }


}