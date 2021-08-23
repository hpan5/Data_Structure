public class Test {
    public static void main(String[] args) {
        /*(LinkedList_Queue<Integer> queue = new LinkedList_Queue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }*/

        LinkedList linkedList = new LinkedList();
        System.out.println("before adding node, the linkedlist is" + (linkedList.isEmpty() ? "" : " not" ) + " empty");
        linkedList.appendHead(new ListNode(0));
        linkedList.appendHead((new ListNode(-1)));
        linkedList.appendTail(new ListNode(1));
        linkedList.appendTail(new ListNode(2));

        ListNode head = linkedList.head;
        for (int i = 0; i < linkedList.length(); i++) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
