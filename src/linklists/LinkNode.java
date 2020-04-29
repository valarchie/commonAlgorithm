package linklists;

public class LinkNode {

    public LinkNode(int value) {
        this.value = value;
    }

    public int value;

    public LinkNode next;

    public LinkNode setNext(LinkNode next) {
        this.next = next;
        return next;
    }

}