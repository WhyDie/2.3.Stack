package ua.whydie;

public class MyStack {
    private final int[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }

        rear = (rear + 1) % capacity; 
        queue[rear] = data;
        size++;
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int data = queue[front];
        front = (front + 1) % capacity; 
        size--;
        System.out.println("Dequeued: " + data);
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No elements to peek.");
            return -1;
        }
        return queue[front];
    }

}
