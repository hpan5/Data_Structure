public class Test {
    public static void main(String[] args) {
        LinkedList_Queue<Integer> queue = new LinkedList_Queue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
