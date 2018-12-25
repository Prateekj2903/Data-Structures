package linked_list;

import java.util.Scanner;

import javax.xml.soap.Node;

public class LinkedList {
	
	NodeLL head = null;
	NodeLL tail = null;
	int length;
	
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
			length = length + 1;
			data = s.nextInt();
		}
		return head;
	}
	
	public void insertAtEnd(int data) {
		NodeLL currNode = new NodeLL(data);
		tail.next = currNode;
		tail = currNode;
		length = length + 1;
	}
	
	public void insertAtBeginning(int data) {
		NodeLL currNode = new NodeLL(data);
		currNode.next = head;
		head = currNode;
		length = length + 1;
	}
	
	public void insertAtPosition(int data, int position) {
		if(position == length) {
			insertAtEnd(data);
			return;
		}
		if(position == 0) {
			insertAtBeginning(data);
			return;
		}
		
		NodeLL currNode = new NodeLL(data);
		NodeLL temp = head;
		
		while(position != 1) {
			temp = temp.next;
			position = position - 1;
		}
		currNode.next = temp.next;
		temp.next = currNode;
		length = length + 1;
	}
	
	public void print() {
		NodeLL temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
