package algo.binarySearchAlt;

public class App {

	public static void main(String[] args) {
		
		System.out.println(binarySearchAlt(new int[] {1,2,3,4,7,9,12,18}, 12));
	}
	// just an alternate way to write the binary search method
	
	
	public static int binarySearchAlt(int [] arr, int x){
		int p = 0;
		int r = arr.length-1;
		
		while(p <= r){
			int q = (p+r)/2;//midpoint
			if(x < arr[q]) r = q - 1; //constrict to first half of the array
			else if(x > arr[q]) p = q + 1;
			else return q;
		}
		return -1;
	}

}
///In this version we are using the process of eliminaiton to narrow our array down untill it return the value we want