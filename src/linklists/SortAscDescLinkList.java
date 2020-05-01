package linklists;

/**
* description: 将奇数位升序，偶数位降序的链表进行重排序。
* @author: valarchie
* on: 2020/5/1
* @email: 343928303@qq.com
*/
public class SortAscDescLinkList {

    public static LinkNode oddLinkList = null;

    public static LinkNode evenLinkList = null;


    public static void main(String[] args) {



        // 初始化测试链表
        LinkNode x1 = new LinkNode(1);
        LinkNode x2 = new LinkNode(10);
        LinkNode x3 = new LinkNode(2);
        LinkNode x4 = new LinkNode(9);
        LinkNode x5 = new LinkNode(3);
        LinkNode x6 = new LinkNode(8);
        LinkNode x7 = new LinkNode(4);
        LinkNode x8 = new LinkNode(7);
        LinkNode x9 = new LinkNode(5);
        LinkNode x10 = new LinkNode(6);

        x1.setNext(x2).setNext(x3).setNext(x4).setNext(x5).setNext(x6).setNext(x7).setNext(x8).setNext(x9).setNext(x10);

        // 先按奇数偶数位拆分链表
        splitList(x1);
        // 再反转链表
        evenLinkList = reverseLinkList(evenLinkList);
        // 再合并链表
        mergeList(oddLinkList, evenLinkList);

        oddLinkList.printList();


    }


    public static void splitList(LinkNode node) {

        oddLinkList = node;
        evenLinkList = node.next;

        LinkNode oddCur = node;
        LinkNode evenCur = node.next;

        while (oddCur != null || evenCur != null) {

            if (oddCur.next != null && oddCur.next.next != null) {
                oddCur.next = oddCur.next.next;
                oddCur = oddCur.next;
            }else {
                oddCur.next = null;
                oddCur = null;
            }

            if (evenCur.next != null && evenCur.next.next != null) {
                evenCur.next = evenCur.next.next;
                evenCur = evenCur.next;
            }else {
                evenCur.next = null;
                evenCur = null;
            }

        }



    }

    public static LinkNode reverseLinkList(LinkNode node) {

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

        return cur;

    }


    public static void mergeList(LinkNode oddLinkList, LinkNode evenLinkList) {

        LinkNode oddTail = oddLinkList;

        while (oddTail.next != null) {
            oddTail = oddTail.next;
        }

        oddTail.next = evenLinkList;

    }


}