package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	static ArrayList<String> strings = new ArrayList<String>(); 
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		strings.add("tabby cat");
		strings.add("terrier dog"); 
		strings.add("snapping turtle");
		strings.add("banana slug");
		strings.add("jellyfish"); 
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		System.out.println("Here are the strings printed in a standard for-loop:");
		for(int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("Here are the strings printed in a for-each loop:");
		for(String a:strings) {
			System.out.println(a);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("Here are the even numbered elements in the list:");
		for(int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			if (i%2==0) {
				System.out.println(s);
			}
			
		}
		//6. Print all the Strings in reverse order.
		System.out.println("Here are the strings printed in reverse order:");
		for(int i = (strings.size()-1); i > -1; i--) {
			String s = strings.get(i);
			System.out.println(s);
		}

		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("Here are the strings with the letter 'e' in them:");
		for(int i = 0; i < strings.size(); i++) {
			if (strings.get(i).contains("e") ) {
				System.out.println(strings.get(i));
			}
		}

	}
}
