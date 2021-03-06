package ds.singlyLinkedList;

//Singly linked means that any given nodes only knows about its next node

public class SinglyLinkedList {
	
//---------------------------------------------------------------------------------
	private Node first; //this is our head node we are just calling it first here but either way its a way for us to keep track of the first node in the LinkedList
//---------------------------------------------------------------------------------
	
	
	public SinglyLinkedList(){//Every class is java has a default constructor...so we dont really need this
		
	}
	
//---------------------------------------------------------------------------------
	
	public boolean isEmpty(){//just checks to see if the list is empty
		return (first == null);
	}
//---------------------------------------------------------------------------------
	
	public void insertFirst(int data){//used to insert at the beginning of the list
		Node newNode = new Node();//just making our node
		newNode.data = data; //the data for the new node is the data that has been passed in when this method is envoked
		newNode.next = first; //the node passed in points at the old front of the list
		first = newNode;//and now the current front of the list points at the new node
	
	}
//---------------------------------------------------------------------------------
	//The problem here with insertLast is that it is not very effecient
	//it current requires us to loop through the whole list in order to insert the last node, which means at worst case this algorithm is O(n)--(check this) if we had a variable holding the last node in the linked list then we could just set current = last making the run time of this algorithm O(1)...
	
	public void insertLast(int data){ //just adds a node to the end of the list
		Node current = first;
		while(current.next != null){
			current = current.next; // we'll loop until current.next is null
		}
		// so now the current value of our reference current is the last node in the list so if we want to insert a node at the end of the list...
		
		Node newNode = new Node();//here we create the node we want to work with
		newNode.data = data;//we set the value of the new node equal to the value passed in
		current.next = newNode;//so we set the value of the last nodes pointer to be the new Node object we just created;
		
		
	}
	
//---------------------------------------------------------------------------------	
	
	public Node deleteFirst(){ //this just removes the first node in the list by leaving it for grabage collection
		
		Node temp = first; //grab first node store in reference temp for later..
		first = first.next;//set firsts pointer to whatever is after the current first thus ignoring what is currently first and leaving it for garbage collection
		return temp;//using the variable temp so that we can return the what is referencing which is the first node
		
	}
	
//---------------------------------------------------------------------------------	
	public void displayList(){//this will just allow us to see the list itself
		System.out.println("List (first --> last)");
		Node current = first;//we need somthing to iterate throughout the loop
		while(current != null){ //also need a condition for the loop to fail eventually
			current.displayNode();//this is the core of what we are doing each loop
			current = current.next;//this is to make sure we can move on to the next node
		}
		System.out.println();//just for formatting
	}
}
