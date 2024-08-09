package ua.whydie;

public class Main {
    public static void main(String[] args) {
        MyStack queue = new MyStack(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element after dequeue is: " + queue.peek());

        queue.enqueue(60);
        queue.enqueue(70);
    }
}