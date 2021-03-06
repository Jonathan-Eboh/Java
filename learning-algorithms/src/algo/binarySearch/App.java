package algo.binarySearch;


//For a binary search to work the data must first be SORTED----if it not sorted you must use a linear search

// divide and conquer approach


//1) give initial values to the range
	//P = 0, r = arr.length - 1
//2) while P <= r do..
	//a) set q = Math.floor((P+r)/2) this gives midpoint we floor so we can catch any floats because indicies are all integers
	//b) if the value we are looking for is located at arr[q] (in the middle of the array) then we just return q
	//c) if arr[q] > x then x is in the first half...which means that r now = q-1
		//else arr[q] < x then leave r where it is and change P to be q+1

//3) return -1 couldnt find the value we were seaching for in this array
public class App {

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 1));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 2));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 3));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 4));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 7));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 9));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 12));
		System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 18));

		System.out.println("Done recursivly: ");
		int [] arr = {1,2,3,4,7,9,12,18};
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 1));
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 2));
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 3));
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 4));
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 7));
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 9));
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 12));
		System.out.println(recursiveBinarySearch(arr, 0, arr.length -1, 18));

	}
	
	public static int binarySearch(int[] arr, int x){
		int P = 0;//1)
		int r = arr.length - 1;//P and r point to differnt values as we adjust the range based on what we are looking for
		
		while(P <= r){//2)
			int q = (P+r)/2;//a) this is the midpoint
			//the above calculated in forced to be an int no need for manual conversion
			
//			System.out.println(q); just for debuggin purposes
			
			if(arr[q] == x){//b) case where value is in the middle
				return q;
			}
			
			if(arr[q] > x){//c)
				r = q - 1; //left side or first half of the array
			}else{
				P = q + 1;
			}
			
//			P++; DO NOT PUT THIS IN LOL P and r change iterate by -1 and +1 respectively 
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int [] arr, int p, int r, int x){
		System.out.println("[ "+ p +"..."+ r + " ]");
		if(p > r){
			return -1; //p crossed over r so we didnt find what we were looking for so return -1
		}else{
			//do binary search
			int q = (p + r)/2;
			
			if(arr[q] == x){// we found it!
				return q;
			}else if(arr[q] > x){
				return recursiveBinarySearch(arr, p, q - 1, x);//first half
			}else{//arr[q] < x
				return recursiveBinarySearch(arr, q + 1, r, x);//second half
			}
		}
		
	}

}
