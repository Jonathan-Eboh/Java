package algo.linearSearch;

public class App {

	public static void main(String[] args) {
		int[] myArr = {1,2,3,4,5};
		
		System.out.println(linearSearch(myArr, 1));
		System.out.println(linearSearch(myArr, 2));
		System.out.println(linearSearch(myArr, 3));
		System.out.println(linearSearch(myArr, 4));
		System.out.println(linearSearch(myArr, 5));
		
		System.out.println("done with recursion");

		System.out.println(recursiveLinearSearch(myArr, 0, 1));
		System.out.println(recursiveLinearSearch(myArr, 0, 2));
		System.out.println(recursiveLinearSearch(myArr, 0, 3));
		System.out.println(recursiveLinearSearch(myArr, 0, 4));
		System.out.println(recursiveLinearSearch(myArr, 0, 5));

	}
	//this is static so that we dont need to create an instance of this entire class every time we want to use this
	//that makes this a class method rather than an instance method
	
	
//The runtime of the algorithm is O(n) so its going to scale with the size of our input array because we have to traverse the whole array
	
	public static int linearSearch(int[] arr, int x){
		int answer = -1;
		for(int i = 0; i < arr.length; i++){ //walk through array
			if(arr[i] == x){//if the value of x is found to be in the array
				answer = i;//then set the answer to be the index of that value
			}
		}
		return answer;//return answer should either be -1 or the index of the target value
	}
	
	//still O(n) because worst cause our target value is all the way at the end so we would still have to traverse the whole array
	
	public static int linearSearchOptomized(int[] arr, int x){
		//dont need to declare variable i here
		for(int i = 0; i < arr.length; i++){ //walk through array
			if(arr[i] == x){//if the value of x is found to be in the array
				return i;//then set the answer to be the index of that value
				
			}
		}
		return -1;//return answer should either be -1 or the index of the target value
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
