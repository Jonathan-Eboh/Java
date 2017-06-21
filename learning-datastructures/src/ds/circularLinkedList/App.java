package ds.circularLinkedList;


public class App {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
//		System.out.println(myList.isEmpty());
		
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(9999999);

		
		myList.displayList();//this should print out our linked list which is currently behaving like a queue (last in first out)----however we can write methods to make it otherwise, such as insert last
	}

}
