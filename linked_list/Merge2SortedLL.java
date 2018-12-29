package single_linkedList;

public class Merge2SortedLL {
//	Iterative
//	Time = O(n+m)
//	Space = O(1)
	public static LinkedListNode<Integer> mergeLL(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
		if(head1 == null) {
			return head2;
		} 
		if(head2 == null) {
			return head1;
		}
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		
		if(head1.data <= head2.data) {
			head = head1;
			tail = head1;
			head1 = head1.next;
		} else {
			head = head2;
			tail = head2;
			head2 = head2.next;
		}
		
		while(head1 != null && head2 != null) {
			if(head1.data <= head2.data) {
				tail.next = head1;
				tail = tail.next;
				head1 = head1.next;
			} else {
				tail.next = head2;
				tail = tail.next;
				head2 = head2.next;
			}
		}
		
		while(head1 != null) {
			tail.next = head1;
			tail = tail.next;
			head1 = head1.next;
		}
		while(head2 != null) {
			tail.next = head2;
			tail = tail.next;
			head2 = head2.next;
		}
		
		return head;
	}
	
	
//	Recursive
//	Time = O(n+m)
//	Space = O(n+m) It will use stack space which is proportional to the length of list
	public static LinkedListNode<Integer> mergeLLRecursion(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
		if(head1 == null && head2 == null) {
			return null;
		}
		
		if(head1 == null) {
			LinkedListNode<Integer> head = new LinkedListNode<Integer>(head2.data);
			head.next = mergeLLRecursion(head1, head2.next);
			return head;
		} 
		if(head2 == null) {
			LinkedListNode<Integer> head = new LinkedListNode<Integer>(head1.data);
			head.next = mergeLLRecursion(head1.next, head2);
			return head;
		}
		
		if(head1.data <= head2.data) {
			LinkedListNode<Integer> head = new LinkedListNode<Integer>(head1.data);
			head.next = mergeLLRecursion(head1.next, head2);
			return head;
		}
		else {
			LinkedListNode<Integer> head = new LinkedListNode<Integer>(head2.data);
			head.next = mergeLLRecursion(head1, head2.next);
			return head;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList();
		LinkedListNode<Integer> head1 = list1.takeInput();
		
		LinkedList list2 = new LinkedList();
		LinkedListNode<Integer> head2 = list2.takeInput();

		LinkedListNode<Integer> mergerLL = mergeLLRecursion(head1, head2);
		
		while(mergerLL != null) {
			System.out.print(mergerLL.data + " -> ");
			mergerLL = mergerLL.next;
		}
		System.out.println("null");
	}

}
