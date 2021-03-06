package algo.recursion;

public class App {

	public static void main(String[] args) {
		//reduceByOne(10);
		
		int[] myArr = {1,2,3,4,5};
		
		System.out.println(recursiveLinearSearch(myArr, 0, 1));
		System.out.println(recursiveLinearSearch(myArr, 0, 2));
		System.out.println(recursiveLinearSearch(myArr, 0, 3));
		System.out.println(recursiveLinearSearch(myArr, 0, 4));
		System.out.println(recursiveLinearSearch(myArr, 0, 5));


	}

	public static void reduceByOne(int n){
		if(n >= 0){//this is the base case
		reduceByOne(n-1);//if we had just this line by itself then it would cause a ~STACK OVERFLOW~!!
		}
		// we dont get here untill AFTER we FIRST hit our base case of -1
		System.out.println("Completed Call" + n);
		
		
		
		
		//reduceByOne(10); yeilds the following output
		//Completed Call-1 <--first thing printed out
		//Completed Call0
		//Completed Call1
		//Completed Call2
		//Completed Call3
		//Completed Call4
		//Completed Call5
		//Completed Call6
		//Completed Call7
		//Completed Call8
		//Completed Call9
		//Completed Call10 <--last thing printed out because this is waiting for all the other function calls to end

		//this is because the recursive calls go all up the stack, and only return back down once it hits the base case
		//in our example the base case is -1 so all the previous calls 
	}
	
	
	public static int recursiveLinearSearch(int [] arr, int i, int x){
		//write the rest...
		int n = arr.length - 1; //dont forget the - 1 here
		if(i > n){// if the number of indicies exceeds the length of the array then we could not find the target value and return -1 to exit the function
			return -1; 
		}else if(arr[i] == x){//in this case we found what we were looking for
			return i; //base case
		}else{
			System.out.println("index at:" + i);
			return recursiveLinearSearch(arr, i + 1, x);
		}
		
	}
	
}


