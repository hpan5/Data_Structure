/*
* ListNode class is created for each element of in the queue, stack, and deque
* field: value, next pointer pointing to next element*/
public class ListNode<E> {
    E value;
    ListNode next;
    public ListNode(E value) {
        this.value = value;
    }
}