package stringReverseWithStack;

public class Reverse {

	private int maxSize;
	private char[] stackArray; //takes and stores values of type char
	private int top;
	
	public Reverse(int size){
		this.maxSize = size;
		this.stackArray = new char[maxSize];//sets the array length to be equal to the passed in value of maxSize
		this.top = -1;// currently have no top but dont want to put it as 0 because thats the index that points to the top. So we put it at -1 for now.
	}
	
	public void push(char j){
		if (maxSize-1 == top) { //this could also be (isFull()) handles case were users trys to add too many items to the stack
			System.out.println("Sorry the stack if full! The value of "+j+" was not added to the stack!");
		} else{
		//push takes values of type char because thats what our stack consist of
		top++; //indicates that our top is now index 0 upon the initial push
		
		stackArray[top] = j; //sets our top to have the value of j
		}
	}
	
	public char pop(){ //will return item that we popped off the stack
		if (isEmpty()){
			return 0; //need this return here because this method MUST return SOMETHING
		}else{
		int old_top = top;
		top--;
		return stackArray[old_top];
		}
	}
	
	public char peak(){
		return stackArray[top]; //just a way to see the current top value on the stack
	}
	
	public boolean isEmpty(){
		return (top == -1); //we initialize our empty stack as having a top value = -1 so that is our check to see if the array is empty
	}
	
	public boolean isFull(){
		return (maxSize-1 == top); //maxSize - 1 because we need to access the last value in the array which is always the length minus one
	}

	
}
