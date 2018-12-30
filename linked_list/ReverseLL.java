package single_linkedList;

public class ReverseLL {
	
//	Time = O(n^2)
//	Space = O(1)
	public static LinkedListNode<Integer> reverseIterative1(LinkedListNode<Integer> head){
		if(head == null) {
			return head;
		}
		
		LinkedListNode<Integer> revHead = null;
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> prevTemp = null;
		
		while(true) {
			while(temp.next != null) {
				prevTemp = temp;
				temp = temp.next;
			}
			
			if(prevTemp != null) {
				prevTemp.next = null;
			}
			
			temp.next = prevTemp;
			
			if(revHead == null) {
				revHead = temp;
			}
			
			if(prevTemp == null) {
				break;
			}
			temp = head;
			prevTemp = null;
		}
		
		return revHead;
	}
	
//	Time = O(n)
//	Space = O(1)
	public static LinkedListNode<Integer> reverseIterative2(LinkedListNode<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		LinkedListNode<Integer> prevNode = null;
		LinkedListNode<Integer> currNode = head;
		LinkedListNode<Integer> nextNode = head.next;
		
		while(currNode != null) {
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
			if(nextNode == null) {
				break;
			}
			nextNode = nextNode.next;
		}
		
		return prevNode;
	} 
	
	
	public static LinkedListNode<Integer> reverseRecursive1(LinkedListNode<Integer> head){
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		LinkedListNode<Integer> head = list.takeInput();
		
		
		LinkedListNode<Integer> reversedList = reverseIterative2(head);
		while(reversedList != null) {
			System.out.print(reversedList.data + " -> ");
			reversedList = reversedList.next;
		}
		System.out.println("null");
		
	}

}
