package stringReverseWithStack;

//import ds.stack.Stack;

public class App {

	public static void main(String[] args) {
		Reverse theStack = new Reverse(3);
//		theStack.push(20);
//		theStack.push(40);
//		theStack.push(60);
//		theStack.push(80); // last in, first out 80 will print out first
		
		
		
//		while(!theStack.isEmpty()){ //as long as the stack is not empty
//			long value = theStack.pop();
//			System.out.println(value);
//		}

		System.out.println(reverseString("HELLO"));
		System.out.println(reverseString("Reverse"));

		
	}

		public static String reverseString(String str){//Our method that reverses the string
			int stackSize = str.length(); //get the max stack size
			
			Reverse theStack = new Reverse(stackSize); //this is where we make the stack --and make it as tall as the string is long
			for(int j = 0; j< str.length(); j++){
				char ch = str.charAt(j); //getting a char form the input string
				theStack.push(ch);
			}
			
			String result ="";
			while(!theStack.isEmpty()){
				char ch = theStack.pop();
				result = result + ch; //appending to the output
				
			}
			
			
			return result;
		}
		
	}


