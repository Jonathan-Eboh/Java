package ds.circularLinkedList;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	//Don't need the constructor in this case but it helps for visibility and completeness
	public CircularLinkedList(){
		first = null;
		last = null;
	}
	
	private boolean isEmpty() {//first will only point to null if there are no nodes in the list
		return first == null; //this will return true or false
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()){
			last = newNode; //assigns the end of the list to be the one and only node that we just created
		}
			newNode.next = first;// newNode --> old first
			first = newNode; // first place, our new first node
		
	}
	
	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()){//So if there are no nodes in the LinkedList then the node passed in will be designated as the first node...
			first = newNode;
		}else{
			last.next = newNode; //the next value of the last node will point to the new node
			last = newNode;//Otherwise the last node in the list will be the node that was just passed in
		}
	}
	
	public int deleteFirst(){
		int temp = first.data;
		
		if(first.next == null){// if this is true it means we have a linked list only one node so...
			last = null; //...when we "delete" that node it means our last node in the list will have a null pointer
		}
		
		first = first.next;//skipping over the current value of first leaving it for garbage collection
		return temp;
	}

	public void displayList(){
		System.out.println("List (first --> last)");
		Node current = first;
		while(current != null){ //dont put current.next here thats take care of on the line where we say current = current.next;
			current.displayNode();
//			System.out.println(current.data);
			current = current.next;
		}
		System.out.println();
	}
}
