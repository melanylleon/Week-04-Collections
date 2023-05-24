package week4;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;


public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
			
			/*Use a StringBuilder when we want to change a String to another String.
			 *  StringBuilder doesn't create many objects like you would have to do when you 
			 *  change a String and doesn't take up space in memory while you change the StringBuilder
			 */
				StringBuilder stringAppended = new StringBuilder();
				
				System.out.println("Characters 0-9 appended to a StringBuilder");
				for (int i = 0; i <= 9; i++) {
					stringAppended.append(i);
					
					if (i < 9) {
						stringAppended.append("-");
					}
				}
				
				System.out.println(stringAppended);
				

		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
				List<String> animals = Arrays.asList("Elephant", "Cheetah", "Zebra", "Hippopotamus", "Lion");
				
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
				System.out.println(shortestString(animals));

		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
				System.out.println();
				
				List<String> switchedElements = firstLastElementSwitched(animals);
				for (String str : switchedElements) {
					System.out.println(str);
				}

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
				System.out.println(concatString(animals));
		
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
				
				System.out.println();
				
				List<String> results = matchStr(words, matchingString);
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
				
				System.out.println();
				System.out.println("List");
				for (List<Integer> list : dividingIntegers) {
					for (Integer num : list) {
						System.out.println(num); 
					}
					
						System.out.println("List");
	
				}
				

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
				System.out.println();
				
				List<Integer> lengths = lengthOfStringElemements(animals);
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
				for (String str : characterSameString) {
					System.out.println(str);
				}
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
				System.out.println();
				List<String> sameString = setToList(schoolSupplies);
				
				for (String string : sameString ) {
					System.out.println(string);
				}

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
				System.out.println();
				
				Set<Integer> firstIntSet = new HashSet<Integer>();
				firstIntSet.add(4);
				firstIntSet.add(7);
				firstIntSet.add(83);
				firstIntSet.add(91);
				firstIntSet.add(78);
				
				Set<Integer> secondSet = evenNumSet(firstIntSet);
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
				System.out.println();
				String wordSearch = "create"; 
				
				System.out.println(dictionaryLookup(dictionary, wordSearch));
				
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
				System.out.println();
				
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
				for (Character c : mapCharacterInteger.keySet()) {
					System.out.println(c + " - " + mapCharacterInteger.get(c));
				}
	}
	
	
	// Method 15:
		public static Map<Character, Integer> characterCount(List<String> groceries) {
			Map<Character, Integer> charCount = new HashMap<Character, Integer>();
			/*int counter = 0;
			
			Set<Character> firstCharacter = new HashSet<Character>();
			for (String food : groceries) {
				firstCharacter.add(food.charAt(0));
				
				
				for (char elementChar : firstCharacter) {
				for (String item : groceries) {
					if (item.charAt(0) == elementChar) {
						counter++;
					}
					
				}
				
				charCount.put(elementChar, counter);
				counter = 0;
			}
			}*/
			
			for (String food : groceries) {
				char c = food.charAt(0);
				if (charCount.get(c) == null) {
					charCount.put(c, 1);
				} else {
					charCount.put(c, charCount.get(c) + 1);
				}
			}
			
			
			return charCount;
			
			
			
		}
	
	
	// Method 14:
	public static String dictionaryLookup(Map<String, String> dictionary, String wordSearch) {
		
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
		
		for (String supply : supplies) {
			listOfSupplies.add(supply);
		}
		
		return listOfSupplies;
	}

	// Method 10:
	public static Set<String> stringCharSet(Set<String> supplies, char letter) {
		Set<String> charString = new HashSet<String>();
		
		for (String supply : supplies) {
			if (supply.charAt(0) == letter)  {
				charString.add(supply);
			}
			
		}
		
		return charString;
		
	}

	
	// Method 8:
	public static List<Integer> lengthOfStringElemements(List<String> animals) {
		List<Integer> stringLength = new ArrayList<Integer>();
		
		for (String animal : animals) {
			stringLength.add(animal.length());
		}
		
		return stringLength;

		
	}

	
	// Method 7:
	public static List<List<Integer>> integersListOfList(List<Integer> integers) {
		/*List<Integer> firstList = new ArrayList<Integer>();		
		List<Integer> secondList = new ArrayList<Integer>();
		List<Integer> thirdList = new ArrayList<Integer>();
		List<Integer> fourthList = new ArrayList<Integer>();
		
		
		for (int i = 0; i < integers.size(); i++) {
			
			if (integers.get(i) % 2 == 0 && integers.get(i) % 3 == 0 && integers.get(i) % 5 == 0) {
				firstList.add(integers.get(i));
				secondList.add(integers.get(i));
				thirdList.add(integers.get(i)); 
			} else if (integers.get(i) % 2 == 0 && integers.get(i) % 3 == 0) {
				firstList.add(integers.get(i));
				secondList.add(integers.get(i));
			} else if (integers.get(i) % 2 == 0 && integers.get(i) % 5 == 0) {
				firstList.add(integers.get(i));
				thirdList.add(integers.get(i)); 
			} else if (integers.get(i) % 3 == 0 && integers.get(i) % 5 == 0) {
				secondList.add(integers.get(i));
				thirdList.add(integers.get(i)); 
			} else if (integers.get(i) % 2 == 0) {
				firstList.add(integers.get(i));
			} else if (integers.get(i) % 3 == 0) {
				secondList.add(integers.get(i));
			} else if (integers.get(i) % 5 == 0) {
				thirdList.add(integers.get(i));
			} else {
				fourthList.add(integers.get(i));
			}
		}
		
		
		List<List<Integer>> intListOfList = new ArrayList<List<Integer>>();
		intListOfList.add(firstList);
		intListOfList.add(secondList);
		intListOfList.add(thirdList);
		intListOfList.add(fourthList);
		
		return  intListOfList;
		*/
		
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());

		
		for (Integer num : integers) {
			if (num % 2 == 0) {
				results.get(0).add(num);
			}
			if (num % 3 == 0) {
				results.get(1).add(num);
			}
			if (num % 5 == 0) {
				results.get(2).add(num);
			}
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				results.get(3).add(num);
			}

		}
		
		return results;
	
	}
	
	// Method 6:
	public static List<String> matchStr(List<String> words, String matchingString) {
		List<String> listAndString = new ArrayList<String>();
		for (String word : words) {
			if (word.contains(matchingString)) {
				listAndString.add(word);
			}
		}
		
		return listAndString;
	}
	
	
	// Method 5:
	public static String concatString(List<String> animals) {
		/*String concatStr = "";
		
		for (int i = 0; i < animals.size(); i++) {
				concatStr += animals.get(i);
			if (i < animals.size() -1) {
				concatStr += ", ";
			}
		}
		
		return concatStr;
		*/
		
		StringBuilder concatStr = new StringBuilder();
		for (int i = 0; i < animals.size(); i++) {
			concatStr.append(animals.get(i));
			if(i != animals.size() - 1) {
				concatStr.append(", ");
			}
		}
		
		return concatStr.toString();
	}
	
	
	// Method 4:
	public static List<String> firstLastElementSwitched(List<String> animals) {
		String firstElement = animals.get(0);
		
		animals.set(0, animals.get(animals.size() - 1));
		animals.set(animals.size() - 1, firstElement);
		
		return animals;
		
	}
	
	
	// Method 3:
	
		public static String shortestString(List<String> animals) {	
			String shortestString = animals.get(0);
			for (String animal : animals) {
				if (animal.length() < shortestString.length()) {
					shortestString = animal;
				}
			}
			
			
		
			return shortestString;
		}

}
	
	

