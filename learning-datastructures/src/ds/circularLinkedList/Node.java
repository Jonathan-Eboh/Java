package ds.circularLinkedList;
//This file goes along with our circular linked list
public class Node {
	public int data;
	public Node next;
	
	public void displayNode(){ //this is important because we will eventually call this in a loop to print out all the nodes in the list. Thats why its better to have this method attached to the node itself
		System.out.println("{ "+ data + " } ");
	}
}
