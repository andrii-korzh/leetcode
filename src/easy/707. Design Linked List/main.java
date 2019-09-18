class MyLinkedList {
	int nextIndex = 0;
	Node head;

	static class Node {
		int val;
		Node next;
		Node(int val) {
			this.val = val;
		}
	}
	/** Initialize your data structure here. */
	public MyLinkedList() {

	}

	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	public int get(int index) {
		if(index >= nextIndex ) return -1;

		Node c = head;
		while(c != null) {
			if(index == 0) return c.val;
			index--;
			c = c.next;
		}
		print();
		return -1;
	}

	/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	public void addAtHead(int val) {
		Node n = new Node(val);
		n.next = head;
		head = n;
		nextIndex++;
		print();
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		nextIndex++;
		Node n = new Node(val);
		if(head == null) {
			head = n;
			return;
		}

		Node c = head;
		while(c.next != null) {
			c = c.next;
		}
		c.next = n;
		print();
	}

	/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	public void addAtIndex(int index, int val) {
		if ( index > nextIndex) return;

		if (index <= 0) {
			addAtHead(val);
		} else if (index == nextIndex) {
			addAtTail(val);
		} else {
			Node c = shift(head,index-1);
			Node n = new Node(val);
			n.next= c.next;
			c.next = n;

			nextIndex++;
		}
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index < 0 || index >= nextIndex) return;
		nextIndex--;
		if (index == 0) {
			head = head.next;
			return;
		}

		Node c = shift(head,index-1);
		c.next = c.next.next;
	}

	Node shift(Node c,int index) {
		for (int i = 0; i < index; i++) {
			c = c.next;
		}
		return c;
	}

	void print(){
		if(true) return;
		System.out.print("-------");
		System.out.println(nextIndex);
		Node n = head;
		while( n!=null){
			System.out.print(n.val+"-");
			n = n.next;
		}
		System.out.println("######");
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */