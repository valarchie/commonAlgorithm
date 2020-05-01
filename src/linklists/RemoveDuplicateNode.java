package linklists;

public class RemoveDuplicateNode {


    public static void main(String[] args) {

        // 初始化测试链表
        LinkNode n1 = new LinkNode(1);
        LinkNode n2 = new LinkNode(1);
        LinkNode n3 = new LinkNode(2);
        LinkNode n4 = new LinkNode(2);
        LinkNode n5 = new LinkNode(2);
        LinkNode n6 = new LinkNode(3);
        LinkNode n7 = new LinkNode(4);

        n1.setNext(n2).setNext(n3).setNext(n4).setNext(n5).setNext(n6).setNext(n7);

        removeDuplicateNode(n1);

        n1.printList();



    }


    /**
     * 移除重复的链表节点
     * @param node
     */
    public static void removeDuplicateNode(LinkNode node) {

        if (node == null) {
            return;
        }

        LinkNode cur = node;
        LinkNode next = node.next;
        int dupicateVal = node.value;

        while (next != null) {

            if (next.value == dupicateVal) {
                next = next.next;
                continue;
            }

            dupicateVal = next.value;

            cur.next = next;
            cur = next;
            next = next.next;


        }



    }



}