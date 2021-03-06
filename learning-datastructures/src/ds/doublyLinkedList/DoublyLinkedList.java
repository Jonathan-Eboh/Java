package ds.doublyLinkedList;

public class DoublyLinkedList {
	
//---------------------------------------------------------------------------------
	//class attributes
	private Node first;
	private Node last;
	
//---------------------------------------------------------------------------------
	//our constructor method
	public DoublyLinkedList(){
		this.first = null;
		this.last = null;
	}
//---------------------------------------------------------------------------------
	
	public boolean isEmpty(){
		return first == null;
	}
//---------------------------------------------------------------------------------
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()){
			last = newNode; //if empty, last will refer to the new Node being created----we are putting the node in and pushing it back by adding to the front
		}else{
			first.previous = newNode;//so first is pointing at the first node in the list. The attribute of previous that is attached to the first node in the list is pointing back to first
		}
		
		newNode.next = first;// the new node's next field will point to the old first
		this.first = newNode; //this is the final step in the insertion, now the reference of first for the linked list will point to the node we just passed in
	}
//---------------------------------------------------------------------------------

	public void insertLast(int data){
		Node newNode = new Node();
		newNode.data = data;
		
//		if(isEmpty()){
//			last = newNode;
//		}else{
//			last.previous = newNode; //
//		}
//		
//		newNode.previous = last;
//		this.last = newNode;
		
		if(isEmpty()){
			first = newNode;// we are putting the node in and keeping it in the front by adding new nodes to the back
		}else{
			last.next = newNode;//assigning old last to new node
			newNode.previous = last;// the old last will be the new nodes previous
		}
		
		last = newNode; //the linkedlist's field should point to the new node
	}
	
	//---------------------------------------------------------------------------------

	//assume non-empty list
	
	public Node deleteFirst(){
		Node temp = first;
		if(first.next == null){// there is only one item in the list
			last = null;
		}else{
			first.next.previous = null; //the list's first node will point to null
		}
		
		first = first.next; // we are assigning the reference of the node following the old first node to the first field in the linked list object
		return temp;// return the deleted first node
	}
	
	//---------------------------------------------------------------------------------

	//still assuming non-empty list
	public Node deleteLast(){
		Node temp = last;
		if(first.next == null){
			first = null; //if we only have one node then we delete it by removing its reference, which is first
		}else{
			last.previous.next = null; //the node before the last node points to nothing we need the .next or else the process of breaking the link is incomplete 
		}
		last = last.previous; //the new last is the node the comes before the old last
		return temp;
	}
	
	//---------------------------------------------------------------------------------
	
	//assuming non-empty list
	public boolean insertAfter(int key, int data){
		Node current = first; //we start from the beginning of the list
		while(current.data != key){// as long as we have not found the key in a particular node
			current = current.next; //advancing current in order to traverse the list
			if(current == null){
				return false; //could not find the target value
			}
		}
		
		Node newNode = new Node();//making..
		newNode.data = data; // our node
		
		if(current == last){
			current.next = null;
			last = newNode;
		}else{
			newNode.next = current.next; //new node's next filed should point to the node ahead of the current one
			current.next.previous = newNode;// the node ahead of current, it's previous field should point to the new node
		}
		
		newNode.previous = current;
		current.next = newNode;
		
		return true;
	}
	
	//---------------------------------------------------------------------------------

	//assume non-empty list
	public Node deleteKey(int key){
		Node current = first;// start from the beginning
		while(current.data != key){ //this isnt an index it is a value
			current = current.next;
			
			if(current == null){//this means we could not find the key in the list
				return null;
				//also returning nothing is different than returning null in java
			}
		}
		if(current == first){
			first = current.next; //make the first field point to the node following current since current will be deleted
		}else{
			current.previous.next = current.next; //This is the key piece of logic here
		}
		
		if(current == last){
			last = current.previous;// point to the one before the one to be deleted 
		}else{
			current.next.previous = current.previous;
		}
		
		return current;
	}
	
	public void displayFoward(){
		System.out.print("List (first --> last): ");
		Node current = first;
		while(current != null){ //dont put current.next here thats take care of on the line where we say current = current.next;
			current.displayNode();
//			System.out.println(current.data);
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward(){
		System.out.print("List (last --> first): ");
		Node current = last;
		while(current != null){ 
			current.displayNode();
			current = current.previous;
		}
		System.out.println();
	}
	
}
