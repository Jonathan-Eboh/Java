package ch1_Arrays_and_Strings;
//Write a method to replace all spaces in a string with '%20'.
//using java so need to us a character array so that you can perform the operation in place

/*
 * Not quite right
//1) take the string that was passed in break it into an array of its characters
//2) loop over the array and replace all the spaces(" ") with "%20"
//3) ???
//4) Profit?
*/


public class Pb3_URLify {

	public static void main(String[] args) {
		String string1 = "Mr John Smith    ";
		//char[] string1Arr = string1.toCharArray();
		
		//System.out.println(urlify(string1));
		urlifyTwo(string1, 13);

	}
	
	public static String urlify(String regString){
		
		char[] CharArr = regString.toCharArray();
		//maybe start at back of string?
		for(int i = 0; i < CharArr.length; i++){
			if(CharArr[i] == ' '){ //remember that in java chars use single quotations ('c') and string use double ("c")
				CharArr[i] = '%';
			}
				
		}
		
		return new String(CharArr);
	}
	
	//---------------------------------------------------------------------

	public static void replaceSpaces(char[] inputStr, int trueLength){
		//first scan___________
		int spaceCount = 0, index, i = 0;
		for(i = 0; i < trueLength; i++){
			if (inputStr[i] == ' '){
				spaceCount++;
			}
		}
		//second scan___________
		index = trueLength + spaceCount * 2; //this is the line where we triple the number of spaces in order to account for the how many extra characters we will have in the final string. The trueLength variable is the length of the string given accounting for the first set of spaces. So in order to avoid double counting we only need add our calculated spaceCount * 2 to the trueLenght. This give us the length of our string accounting for the extra spaces that '%20' will occupy
		if(trueLength < inputStr.length) inputStr[trueLength] = '\0'; // this just caps the array length at the index that is equal to the trueLenght given to us
		for(i = trueLength - 1; i >= 0; i--){ //starting at the last index in the array (hench the [length - 1] where out trueLenght = length)
			if(inputStr[i] == ' '){
				inputStr[index - 1] = '0';
				inputStr[index - 2] = '2';
				inputStr[index - 3] = '%';
				index = index - 3;
			} else {
				inputStr[index - 1] = inputStr[i];
				index--;
			}
		}	
		System.out.println(inputStr); //this is working
	}
 //----------just for ease of reading-----made it a clean function definition below	
	public static void urlifyTwo(String inputString, int truSize){
		
		char[] inputStringArr = inputString.toCharArray();
		
		replaceSpaces(inputStringArr, truSize);
		
	}
	
}
