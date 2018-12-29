package single_linkedList;

import java.util.HashSet;

public class DetectLoop {

//  Hashing - 
//  Time = O(n)
//  Space = O(n)
	public static boolean detectLoopHashing(LinkedListNode<Integer> head) {
		if(head == null) {
			return false;
		}
		
		HashSet<LinkedListNode<Integer>> set = new HashSet<>();
		LinkedListNode<Integer> temp = head;
		
		while(!set.contains(temp)) {
			if(temp == null) {
				return false;
			}
			set.add(temp);
			temp = temp.next;
		}
		
		return true;
	}
	
	
//	Floyd’s Cycle-Finding Algorithm:
//	This is the fastest method. 
//	Traverse linked list using two pointers.  
//	Move one pointer by one and other pointer by two.  
//	If these pointers meet at some node then there is a loop.  
//	If pointers do not meet then linked list doesn’t have loop.

//  Time = O(n)
//  Space = O(1)
	public static boolean detectLoopFloyd(LinkedListNode<Integer> head) {
		
		if(head == null) {
			return false;
		}
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head.next;
		
		while(slow != fast) {
			if(fast == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		LinkedListNode<Integer> head = list.takeInput();
		
		System.out.println("Floyd - " + detectLoopFloyd(head));
		System.out.println("Hashing - " + detectLoopHashing(head));
		
		// Creating a loop
		head.next.next.next.next = head.next;
		
		System.out.println("Floyd - " + detectLoopFloyd(head));
		System.out.println("Hashing - " + detectLoopHashing(head));
	}

}
