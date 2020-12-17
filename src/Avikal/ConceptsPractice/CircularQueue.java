package Avikal.ConceptsPractice;

public class CircularQueue {
	private int size = 5;
	private int front, rear;
	private int[] queue = new int[size];

	CircularQueue() {
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		return (rear == size - 1 && front == 0) || (front == rear + 1);
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public void enQueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(front == -1) front = 0;
			rear = (rear + 1) % size;
			queue[rear] = element;
			System.out.println(element + " Element inserted.");
		}
	}

	public int deQueue() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		else {
			element = queue[front];
			if(front == rear) {
				front = rear = -1;
			}
			else {
				front = (front + 1) % size;
			}
			return element;
		}
	}

	public void display() {
		int  i;
		if(isEmpty()) {
			System.out.println("Queue is empty.");
		}
		else {
			System.out.println("Front -> " + front);
			System.out.println("==========================");
			for(i = front; i != rear+1; i = (i + 1) % size) {
				System.out.print(queue[i] + " ");
			}
			System.out.println("\n==========================");
			System.out.println("Rear -> " + rear);
		}

	}
	
	public static void main(String[] argss) {
		CircularQueue cQ = new CircularQueue();
		cQ.deQueue();
		cQ.enQueue(10);
		cQ.enQueue(20);
		cQ.enQueue(99);
		cQ.enQueue(9987);
		cQ.enQueue(856);
		cQ.display();
	}

}
