/*A Queue(FIFO)data structure implemented by linkedlist
* the following functions will be implemented:
* offer: offer at tail
* poll: poll at the head
* peek: look at the head
* */
public class LinkedList_Queue<E> {
    ListNode head;
    ListNode tail;
    int size;

    public LinkedList_Queue() {
        head = tail = null;
    }

    public void offer(E element) {
        if (head == null) {
            head = new ListNode(element);
            tail = head;
        } else{
            tail.next = new ListNode(element);
            tail = tail.next;
        }
    }

    public E poll() {
        if (head == null) {
            return null;
        }
        ListNode polledNode = head;
        head = head.next;
        if (head == null){
            tail = null;
        }
        polledNode.next = null;
        return (E) polledNode.value;
    }

    public E peek() {
        if (head == null) {
            return null;
        }
        return (E) head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
