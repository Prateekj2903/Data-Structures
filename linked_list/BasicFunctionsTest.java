package linked_list;

import java.util.Scanner;

public class BasicFunctionsTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		LinkedList linkedlist = new LinkedList();
		NodeLL head = linkedlist.takeInput();
		linkedlist.print();
		
		System.out.println("Enter data to be added at the end of LL");
		int data = s.nextInt();
		linkedlist.insertAtEnd(data);
		linkedlist.print();
		
//		System.out.println("Enter data to be added at the beginning of LL");
//		data = s.nextInt();
//		linkedlist.insertAtBeginning(data);
//		linkedlist.print();
//		
//		System.out.println("Enter data to be added in LL");
//		data = s.nextInt();
//		System.out.println("Enter the position of the data");
//		int position = s.nextInt();
//		linkedlist.insertAtPosition(data, position);
//		linkedlist.print();
		
	}

}
