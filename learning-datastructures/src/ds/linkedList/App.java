package ds.linkedList;

public class App {

	public static void main(String[] args) {
		Node firstNode = new Node(30);
		Node secondNode = new Node(40);
		Node thirdNode = new Node(50);
		Node fourthNode = new Node(60);
		
		//linking the nodes 
		firstNode.next = secondNode; //the reason why firstNode.next is not set = to secondNode.value is because you cannot convert from type int to type Node so in order to keep in between two node types we set the .next of one node to the value of another whole node
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;

		LinkedList myList = new LinkedList(firstNode);
		
		myList.Show();
		
		
		System.out.println(listLength(firstNode));//4
		System.out.println(listLength(secondNode));//3

		
		
	}
	
	public static int listLength(Node aNode){
		int count = 0;
		Node currentNode = aNode;
		while(currentNode != null){
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}		

}
