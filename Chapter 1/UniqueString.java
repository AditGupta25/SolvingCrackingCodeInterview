import java.io.*;
import java.util.*;
import java.*;
import java.lang.Iterable;

//In this program I need to implement an algorithm to determine if a string has all unique characters 
public class UniqueString{
	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Welcome to Unique Character Checker. Please input a string:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //System.out.println(input);

        //Now that I have input stored in a variable, I want to run an algorithm to make sure there are not any unique variables 
       	//if we were given unicode or ASCII, we could perhaps use a boolean array to see repition, and that would cost O(n) time
       	//Let's try to do this without using any other data structues (in place). 

	       	if(StringChecker(input) == false){
	       		System.out.println("Looks like this input had repeating characters!");
	       	}
	       	else{
	       		System.out.println("This input had all unique characters!");
	       	}
       
	}
	public static boolean StringChecker(String str){
		boolean checker = true;
		for(int i = 0; i < str.length(); i++){
       		for(int j = i+1; j< str.length(); j++){
       			if(str.charAt(i) == str.charAt(j)){
       				checker = false;
       			}    		
       		}
       	}
       	return checker;
	}

}
//Looks like because of the nested loop this has O(n^2) run time