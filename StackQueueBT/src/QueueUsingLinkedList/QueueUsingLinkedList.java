package QueueUsingLinkedList;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue queue= new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Queue Front: " + ((queue.front != null) ? (queue.front).key : -1));
        System.out.println("Queue Rear: " + ((queue.rear != null) ? (queue.rear).key : -1));
    }
}
