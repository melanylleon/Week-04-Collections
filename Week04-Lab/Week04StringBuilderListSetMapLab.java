package week4;

import java.util.List; 
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
			
				//	We use a StringBuilder when we want to change a String. A String can't be changed but a StringBuilder can be changed.
			 
				StringBuilder stringBuilder = new StringBuilder();
				
				System.out.println("Characters 0-9 appended to a StringBuilder:");
				for (int i = 0; i <= 9; i++) {
					stringBuilder.append(i);
					
					if (i < 9) {
						stringBuilder.append("-");
					}
				}
				
				System.out.println(stringBuilder + "\n");
				

		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
				List<String> animals = Arrays.asList("Elephant", "Cheetah", "Zebra", "Hippopotamus", "Lion");
				
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
				System.out.println("The shortest string in the animals list is " + shortestString(animals) + ".");

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched				
				List<String> switchedElements = firstLastElementSwitched(animals);
				
				System.out.println("\nThe first and last element of the animals list switched: ");
				for (String str : switchedElements) {
					System.out.println(str);
				}

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
				System.out.println("\nAll of the elements of the animals list concatenated: " + concatString(animals));
		
				
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
				String matchingString = "tion";
				List<String> words = new ArrayList<String> ();
				words.add("Explanation");
				words.add("Orientation");
				words.add("Hour"); 
				words.add("Date"); 
				words.add("Translation"); 
								
				List<String> results = matchStr(words, matchingString);
				
				System.out.println("\nThe words in the words list that contain \"" + matchingString + "\":");
				//Prints the new list of string with only the words from the words list that contain the value of the matchingString variable
				for (String result : results) {
					System.out.println(result);
				}

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
				
				List<Integer> integers = new ArrayList<Integer>();
				integers.add(33); //Just divisible by 3
				integers.add(60); //Divisible by all 3 numbers
				integers.add(20); //Divisible by 2 and 5
				integers.add(15); //Divisible by 3 and 5
				integers.add(12); //Divisible by 2 and 3
				integers.add(32); //Just divisible by 2
				integers.add(55); //Just divisible by 5
				integers.add(7);  //Not divisible by any of them
				
				List<List<Integer>> dividingIntegers = integersListOfList(integers);
				
				int i = 1;
				System.out.println("\nNumbers divisible by " + 2);
				
				//Prints the elements of each list in the list of lists
				for (List<Integer> list : dividingIntegers) {
					for (Integer num : list) {
						System.out.println(num); 
					}
						i += 2;
						if (i <= 5) { 
							System.out.println("\nNumbers divisible by " + i);
						} else if (i == 7) {
							System.out.println("\nNumbers not divisible by 2, 3, and 5");
						}
				}
				

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string				
				List<Integer> lengths = lengthOfStringElemements(animals);
				
				System.out.println("\nThe length of each string in the animals list: ");
				for (Integer length: lengths) {
					System.out.println(length);
				}
				
		
		// 9. Create a set of strings and add 5 values
				Set<String> schoolSupplies = new HashSet<String>();
				schoolSupplies.add("Notebook");
				schoolSupplies.add("Pencil");
				schoolSupplies.add("Eraser");
				schoolSupplies.add("Paper Clip");
				schoolSupplies.add("Sticky Notes");
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
				char character = 'P';
				
				Set<String> characterSameString = stringCharSet(schoolSupplies, character);
				
				System.out.println("\nElements in the characterSameString set that start with the letter " + character + ":");
				for (String str : characterSameString) {
					System.out.println(str);
				}
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
				List<String> sameString = setToList(schoolSupplies);
				
				System.out.println("\nElements of a list with the same elements as the schoolSupplies set:");
				for (String string : sameString ) {
					System.out.println(string);
				}

				
		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integer containing only even numbers 
		//			from the original set				
				Set<Integer> firstIntSet = new HashSet<Integer>();
				firstIntSet.add(4);
				firstIntSet.add(7);
				firstIntSet.add(83);
				firstIntSet.add(91);
				firstIntSet.add(78);
				
				Set<Integer> secondSet = evenNumSet(firstIntSet);
				
				System.out.println("\nA set containing only the even numbers of the firstIntSet set:");
				for (Integer num : secondSet) {
					System.out.println(num);
				}
				
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
				Map<String, String> dictionary = new HashMap<String, String>(); 
				dictionary.put("search", "to go find something");
				dictionary.put("create", "to make something");
				dictionary.put("assemble", "to put something together");
				
				
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
				String wordSearch = "create"; 
				
				System.out.println("\nThe value for the key \"" + wordSearch + "\" in the dictionary map is \"" + dictionaryLookup(dictionary, wordSearch) + "\".");
				
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
				
				List<String> groceries = new ArrayList<String>();
				groceries.add("apples");
				groceries.add("pears");
				groceries.add("grapes");
				groceries.add("peaches");
				groceries.add("plantains");
				groceries.add("bananas");
				groceries.add("butter");
				groceries.add("cereal");
				groceries.add("coffee");
				groceries.add("cinnamon");
				groceries.add("milk");

				Map<Character, Integer> mapCharacterInteger = characterCount(groceries);
				
				System.out.println("\nThe first letter of every element in the groceries list and the count of the elements that start with that character: ");
				//Prints the first character of every element in the groceries List and the count of the Strings that start with that character
				for (Character c : mapCharacterInteger.keySet()) {
					System.out.println(c + " - " + mapCharacterInteger.get(c));
				}
	}
	
	
	// Method 15:
	public static Map<Character, Integer> characterCount(List<String> groceries) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
			
		for (String food : groceries) {
			char c = food.charAt(0); //Looks for the first character of each element in the list of string
			if (charCount.get(c) == null) {
				charCount.put(c, 1); //Adds a character and a count of 1 to the map if that character is not in the map  
			} else { //Adds 1 to the value associated with a key that matches the first character of an element in the groceries list 
				charCount.put(c, charCount.get(c) + 1);
			}
		}
			
			return charCount;	
		}
	
	
	// Method 14:
	public static String dictionaryLookup(Map<String, String> dictionary, String wordSearch) {
		
		//Checks each key in the dictionary map to see if one of them matches the value of the wordSearch variable
		for (String key : dictionary.keySet()) {
			if(key.equals(wordSearch)) {
				return dictionary.get(key);
			} 
		}
		
		return "";		
	}

	
	// Method 12:
	public static Set<Integer> evenNumSet(Set<Integer> firstIntSet) {
		Set<Integer> secondEvenIntSet = new HashSet<Integer>();
		
		//Adds only the elements that are even numbers from the firstIntSet set to the secondEvenIntSet set
		for (Integer integer : firstIntSet) {
			if(integer % 2 == 0) {
				secondEvenIntSet.add(integer); 
			}
		}
		
		return secondEvenIntSet;
	}

	
	// Method 11:
	
	public static List<String> setToList(Set<String> supplies) {
		List<String> listOfSupplies = new ArrayList<String>();
		
		//Adds the elements of the set to the list
		for (String supply : supplies) {
			listOfSupplies.add(supply);
		}
		
		return listOfSupplies;
	}

	// Method 10:
	public static Set<String> stringCharSet(Set<String> supplies, char letter) {
		Set<String> charString = new HashSet<String>();
		
		//Compares the first character of each string in the supplies set to a character to check if they match
		for (String supply : supplies) {
			if (supply.charAt(0) == letter)  {
				charString.add(supply); //If they match, the element of the supplies set is added to the charString set
			}
		}
		
		return charString;
		
	}

	
	// Method 8:
	public static List<Integer> lengthOfStringElemements(List<String> animals) {
		List<Integer> stringLength = new ArrayList<Integer>();
		
		//Gets the length of each string in the animals list and adds it to the stringLength list
		for (String animal : animals) {
			stringLength.add(animal.length());
		}
		
		return stringLength;
	}

	
	// Method 7:
	public static List<List<Integer>> integersListOfList(List<Integer> integers) {
	
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());

		//Adds elements to the 4 lists in the list of lists
		for (Integer num : integers) {
			if (num % 2 == 0) {
				results.get(0).add(num); //Adds an element to the first list if a number from the integers list is divisible by 2
			}
			if (num % 3 == 0) {
				results.get(1).add(num); //Adds an element to the second list if a number from the integers list is divisible by 3
			}
			if (num % 5 == 0) {
				results.get(2).add(num); //Adds an element to the third list if a number from the integers list is divisible by 5
			}
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				results.get(3).add(num); //Adds an element to the fourth list if a number from the integers list is divisible by 2, 3 and 5
			}
		}
		
		return results;
	}
	
	
	// Method 6:
	public static List<String> matchStr(List<String> words, String matchingString) {
		List<String> listAndString = new ArrayList<String>();
		
		for (String word : words) {
			if (word.contains(matchingString)) {//Checks if the elements of the words list contain the value of the matchingString variable
				listAndString.add(word);//If an element does contain the value of the matchingString variable, it adds it to a new list called listAndString
			}
		}
		
		return listAndString;
	}
	
	
	// Method 5:
	public static String concatString(List<String> animals) {
		StringBuilder concatStr = new StringBuilder();
		
		for (int i = 0; i < animals.size(); i++) {
			concatStr.append(animals.get(i)); //Builds a string with all of the elements of the animals list concatenated to each other
			if(i != animals.size() - 1) {
				concatStr.append(", "); //Adds a comma in between each element but not after the last element
			}
		}
		
		return concatStr.toString();
	}
	
	
	// Method 4:
	public static List<String> firstLastElementSwitched(List<String> animals) {
		String firstElement = animals.get(0);
		
		//Sets first element of the list to the value of the last element of the list
		animals.set(0, animals.get(animals.size() - 1));
		//Sets the last element of the list to the value of the first element of the list
		animals.set(animals.size() - 1, firstElement);
		
		return animals;
		
	}
	
	
	// Method 3:
		public static String shortestString(List<String> animals) {	
			String shortestString = animals.get(0);
			
			//Compares the length of each element of the list with the first element's length to find the element with the shortest length
			for (String animal : animals) {
				if (animal.length() < shortestString.length()) { 
					shortestString = animal;  
				}
			}
			
			return shortestString;
		}

}
	
	

