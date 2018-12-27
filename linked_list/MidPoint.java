package single_linkedList;

public class MidPoint {
	
//	Time = O(n)
//	Space = O(1)		
	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
		if(head == null) {
			return head;
		}
		
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		LinkedListNode<Integer> head = list.takeInput();
		
		LinkedListNode<Integer> mid = midPoint(head);
		if(mid != null) {
			System.out.println("Mid Point = " + mid.data);
		}

	}

}
