package ds.linkedList;

public class Node {
	
	public int value;
	public Node next;// self referencial class or recursive class deffinition

	public  Node(int val){
		this.value = val;
		this.next = null;
	}
}
