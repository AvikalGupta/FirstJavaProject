package Avikal.HerbertSchildt;

public class Stack {
	
	int stck[] = new int[10];
	int top;
	
	Stack() {
		top = -1;
	}
	
	void push(int item) {
		if(top == 9)
			System.out.println("Stack is full");
		else
			stck[++top] = item;
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return stck[top--];
	}
}

