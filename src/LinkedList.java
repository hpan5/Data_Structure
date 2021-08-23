/*
* a linked list is constructed by a list of listnode
* fields to have, size, head, tail,
* append head, append tail, get, length, isempty
* */
public class LinkedList {
    int size = 0;
    ListNode head;
    ListNode tail;

    public void appendHead(ListNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (head == tail) {
            node.next = tail;
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void appendTail(ListNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
