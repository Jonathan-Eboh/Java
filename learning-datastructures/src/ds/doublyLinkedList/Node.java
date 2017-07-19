package ds.doublyLinkedList;

public class Node {
	public int data;
	public Node next;
	public Node previous; //this is the key element here. This is what really makes this a doubly linked list
	
	public void displayNode(){
		System.out.print(" {"+ data +"} ");
	}
}