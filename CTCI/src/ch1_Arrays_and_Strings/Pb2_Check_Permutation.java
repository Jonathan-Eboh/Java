package ch1_Arrays_and_Strings;

//Given two string, write a method to decide if one is a permutation of the other.

//Key words, need to make sure a string is a permutation of the one its compared to because of this casing will matter
// define what it means to be a permutation:
// -1 the two strings are of equal length
// -2 the two strings contain the same characters in any order allowed by the factorial(probably should not use factorial as it will increase the run time to calculate the factorial of a given string) of the string length

//because of the situation where a string may have duplicate chars I will probably need a hash table

//1) first thing we can do off the bat is compare the lengths of the two strings, if there are different just return false
//2) if they get past that check

public class Pb2_Check_Permutation {

	public static void main(String[] args) {
		String word1 = "Cat"; 
		String word2 = "taC";
		//comparing the above two should return true
		String word3 = "dog";
		String word4 = "ogd";
		//comparing the above two should return true
		String word5 = "fan";
		String word6 = "fann";
		//comparing the above two should return false
		String word7 = "look";
		String word8 = "book";
		//comparing the above two should return false
		String word9 = "ggg";
		String word10 = "ggh";
		//comparing the above two should return false

	}
	
	public boolean isPermutation(String wordOne, String wordTwo){
		if(wordOne.length() != wordTwo.length()) return false; //if the strings arnt the same length then they arnt permutations
		
		
		
		return false;
	}

}
