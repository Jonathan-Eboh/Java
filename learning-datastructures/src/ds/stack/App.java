package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(3);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80); // last in, first out 80 will print out first
		
		while(!theStack.isEmpty()){ //as long as the stack is not empty
			long value = theStack.pop();
			System.out.println(value);
		}


	}

		public static String reverseString(String str){
			return str;
		}
}
