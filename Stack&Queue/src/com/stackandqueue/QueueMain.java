package com.stackandqueue;

public class QueueMain {
	public static void main(String[] args) {
		System.out.println("Welcome to  Queue Program");
		
		Queue queue = new Queue();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		System.out.println("Enqueue list :: ");
		queue.print();
		System.out.println("\n");
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		System.out.println("Dequeue list :: ");
		queue.print();
	}
}
