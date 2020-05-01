package linklists;

public class LinkNode {

    public LinkNode(int value) {
        this.value = value;
    }

    public LinkNode() {

    }

    public int value;

    public LinkNode next;

    public LinkNode setNext(LinkNode next) {
        this.next = next;
        return next;
    }


    public void printList() {

        System.out.println(value);

        LinkNode node = this;

        while (node.next != null) {

            node = node.next;

            System.out.println(node.value);

        }

    }

    public void printNode() {
        System.out.println(value);
    }

}