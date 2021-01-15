package com.psl.training.assignment.excephand;

public class ContactStack {
	int maxSize = 5;
	int top = -1;
	Contact stack[] = new Contact[maxSize];

	boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	boolean isFull() {
		if (top == (maxSize - 1)) {
			return true;
		}
		return false;
	}

	void push(Contact cont) throws Exception {
		if (isFull()) {
			throw new Exception("Overflow Exception: stack is full");
		}
		boolean isContactValid = false;
		try {
			isContactValid = cont.validate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (isContactValid) {
			top++;
			stack[top] = cont;
			System.out.println("New contact saved");
			System.out.println("Top: " + top);
		} else {
			throw new Exception("Validation Failed Exception: invalid contact");
		}
	}

	void pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Underflow Exception: stack is empty");
		}
		Contact cont = stack[top];
		top--;
		System.out.println("Pop is successful");
		System.out.println("Deleted Contact: ");
		System.out.println(cont);
		System.out.println("Top: " + top);
	}

}
