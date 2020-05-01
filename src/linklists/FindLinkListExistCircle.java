package linklists;

public class FindLinkListExistCircle {

    public static void main(String[] args) {


        System.out.println(isExistCircle(LinkNodeTestData.TEST_LINK_3));


    }


    public static boolean isExistCircle(LinkNode node) {

        LinkNode slow = node;
        LinkNode fast = node;

        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }

        }

        return false;
    }


}