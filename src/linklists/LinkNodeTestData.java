package linklists;

public class LinkNodeTestData {

    public static LinkNode TEST_LINK_1 = null;
    public static LinkNode TEST_LINK_2 = null;
    public static LinkNode TEST_LINK_3 = null;
    public static LinkNode TEST_LINK_4 = null;
    public static LinkNode TEST_LINK_5 = null;

    static {

        // 初始化测试链表
        LinkNode l1 = new LinkNode(1);
        LinkNode l2 = new LinkNode(2);
        LinkNode l3 = new LinkNode(3);
        LinkNode l4 = new LinkNode(4);
        LinkNode l5 = new LinkNode(5);

        l1.setNext(l2).setNext(l3).setNext(l4).setNext(l5);

        TEST_LINK_1 = l1;



    }

    static {

        // 初始化测试链表
        LinkNode l1 = new LinkNode(1);
        LinkNode l2 = new LinkNode(2);
        LinkNode l3 = new LinkNode(3);
        LinkNode l4 = new LinkNode(4);
        LinkNode l5 = new LinkNode(5);
        LinkNode l6 = new LinkNode(6);
        l1.setNext(l2).setNext(l3).setNext(l4).setNext(l5).setNext(l6);

        TEST_LINK_2 = l1;
    }


    static {

        // 初始化测试链表
        LinkNode l1 = new LinkNode(1);

        TEST_LINK_3 = l1;
    }

    static {

        // 初始化测试链表
        LinkNode l1 = new LinkNode(1);
        LinkNode l2 = new LinkNode(2);

        TEST_LINK_4 = l1;
    }

    static {

        // 初始化测试链表
        LinkNode l1 = new LinkNode(1);
        LinkNode l2 = new LinkNode(2);
        LinkNode l3 = new LinkNode(3);
        LinkNode l4 = new LinkNode(4);
        LinkNode l5 = new LinkNode(5);

        l1.setNext(l2).setNext(l3).setNext(l4).setNext(l5).setNext(l3);

        TEST_LINK_5 = l1;



    }


//    public static void printLinkNodes(LinkNode node) {
//
//        if (node != null) {
//
//            System.out.println(node.value);
//
//            while (node.next != null) {
//
//                node = node.next;
//
//                System.out.println(node.value);
//
//            }
//
//        }
//
//    }
//
//    public static void printLinkNode(LinkNode node) {
//
//        if (node != null) {
//
//            System.out.println(node.value);
//
//        }
//
//    }


}