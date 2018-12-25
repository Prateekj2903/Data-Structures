package linked_list;

import java.util.Scanner;

public class LinkedList {
	
	NodeLL head = null;
	NodeLL tail = null;
	
	public NodeLL takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Data(Enter -1 to stop)");
		
		int data = s.nextInt();
		while(data != -1) {
			NodeLL currNode = new NodeLL(data);
			if(head == null) {
				head = currNode;
				tail = currNode;
			}
			else {
				tail.next = currNode;
				tail = tail.next;
			}
			tail.next = null;
			data = s.nextInt();
		}
		return head;
	}
	
	public void print() {
		NodeLL temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
}
