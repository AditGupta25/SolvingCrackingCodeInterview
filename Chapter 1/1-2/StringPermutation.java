import java.io.*;
import java.util.*;
import java.*;
import java.lang.Iterable;

//In this program I need to implement an algorithm to determine if 2 strings are permutations of each other
public class StringPermutation{

	public static void main(String[] args) {

		System.out.println("");
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to String Permutation Checker. Example \"dog\" is a permutation of \"god\" ");
		System.out.println("Please input your first string:");
        String input1 = scan.nextLine();
        System.out.println("Please input your second string:");
        String input2 = scan.nextLine();

        if(PermutationChecker(input1, input2) == true) {
        	System.out.println("It looks like " + "\"" + input1 + "\"" + " is certainly a permutation of " + "\"" + input2 + "\"");
        } else {
        	System.out.println("No, " + "\"" + input1 + "\"" + " and " + "\"" + input2 + "\"" + " are NOT permutations of each other");
        }

       
	}
	public static boolean PermutationChecker(String str1, String str2){
		boolean checker = true;
		String tempString = "";

			if(str1.length() != str2.length()){
				checker = false;
			}else {

			for (int i = str2.length() - 1 ; i >= 0; i--){
				char character = str2.charAt(i);
				tempString = tempString + character;
			}	
			
			if(tempString.equals(str1)){
				checker = true;
			}
			else{
				checker = false;
			}
		}
	return checker;
	}
	
}

//This algorithm that was implemented works on string comparison and has a runtime of O(n)