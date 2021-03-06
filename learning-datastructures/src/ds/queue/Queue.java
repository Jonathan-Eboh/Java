package ds.queue;
//cmd+option+y for soft wrap in eclipse on macs

public class Queue {
	private int maxSize; //need this to initialize a container with a set number of slots
private long[] queArray;//slots to main the data
private int front; // this will be the index position for the element in the front
private int rear; //going to be the index position for the element at the back of the line
private int nItems; //counter to maintain the number of items in our queue

	public Queue(int size){ //constructor
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;//index position of the first slot of the array
		rear = -1;//there is no item in the array yet to be considered as the last item
		nItems = 0;//dont have elements in the array yet	
	}
	
	public void insert(long j){
		if(rear == maxSize - 1){
			rear = -1;
		}//the reason why we dont wrap the rest of the method in an else clause is because we want the functionality of overwriting the value at the begining of the queue if our queue is already full.....if you want to prevent extra input wrap the rest of the code in an else clause... THIS IS THE DIFFERENCE BETWEEN A CIRCULAR QUEUE AND A REGULAR QUEUE
		rear++; //when we add something to a queue we add it to the rear
		queArray[rear] = j;//new value is set to the most recent value passed into the array
		nItems++;//number of items increases by one for every item passed in
		
	}
	
	
	public long remove() {//This method removes an item from the front of the queue
		long temp = queArray[front];//this is how we access the value at the front of the queue
		front++;//Here we change front to be the next value in the array since we removed the old one
		if(front == maxSize){//because of the way we defined things if front = maxSize that means our array is empty
			front = 0;//in which case we set front back to the 0th index so that we can utilize the entire array again
		}
		nItems --;//the number of items in the array will decrease by one every time we remove something from the front
		return temp;
	}
	
	public long peakFront(){
		return queArray[front];//just returns the value at the front of the stack without changing it
	}
	
	public boolean isFull(){ //check to see if queue is full
		return (nItems == 0);
	}
	
	public boolean isEmpty(){//check to see if its empty
		return (nItems == maxSize);
	}
	
	public void view(){
		System.out.print(" The current stack is comprised of the values: [-");
		for (int i = 0; i < queArray.length; i++) {
			System.out.print(  queArray[i] +"-");
		}
		
		System.out.print("]");
	}
}
