package single_linkedList;

import java.util.Scanner;

public class NthNode {

	
//	Time = O(n)
//	Space = O(1)
	public static LinkedListNode<Integer> nthFront(LinkedListNode<Integer> head, int n) {
		if(head == null || n == 0) {
			return null;
		}
		
		int i = 0;
		LinkedListNode<Integer> temp = head;
		while(i < n-1) {
			if(temp == null) {
				return null;
			}
			temp = temp.next;
			i++;
		}
		return temp;
	}
	
	
	
//	Time = O(n)
//	Space = O(1)
	public static LinkedListNode<Integer> nthEnd(LinkedListNode<Integer> head, int n){
		if(head == null || n == 0) {
			return null;
		}
		
		LinkedListNode<Integer> first = head;
		LinkedListNode<Integer> second = head;
		int i = 0;
		
		while(i < n) {
			if(first == null) {
				return null;
			}
			first = first.next;
			i++;
		}
		
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		return second;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		LinkedListNode<Integer> head = list.takeInput();
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		LinkedListNode<Integer> front = nthFront(head, n);
		if(front != null) {
			System.out.println("Nth node fron front = " + front.data);
		}	
		
		LinkedListNode<Integer> end = nthEnd(head, n);
		if(end != null) {
			System.out.println("Nth node fron end = " + end.data);
		}	
		
	}

}
