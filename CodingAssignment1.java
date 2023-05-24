package week4;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CodingAssignment1 { 

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
				b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
				c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		 */
		
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 35};
		int sum = 0;
		
		ages[ages.length - 1] -= ages[0]; //Subtracting first element from the last element in the int array
		System.out.println(ages[ages.length - 1]);
		
		for (int age : ages) {
			sum += age;  //Calculating the sum of all of the ages in the array
		}
		
		int average = sum / ages.length; //Calculating the average age
		System.out.println(average);
		
		
		
		
	/*2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	*/
		
		String[] names = {"Sam", "Tommy" , "Tim", "Sally", "Buck", "Bob"};
		int sumLength = 0;
		String concatNames = "";
		
		for (String name : names) { 
			sumLength += name.length(); //Calculating the sum of the letters of each element in the String array
		}
		
		int aveLength = sumLength / names.length; //Calculating the average number of letter in the array
		System.out.println(aveLength);
		
		
		for (String name : names) {
			concatNames += name + " "; //Concatenates the Strings in the array into one String
		}
		
		System.out.println(concatNames);
		

		
		
		//3.	How do you access the last element of any array?
			//You can access the last element in an array by typing the array name followed by square brackets. Inside the
			//square brackets you type the name of the array, a dot, and length minus 1.
			// Example:  ages[ages.length - 1]
		
		
		
		//4.	How do you access the first element of any array?
			//You can access the first element in an array by typing the array name followed by square brackets. Inside the
			// square brackets add a 0 (the index of the first position in any array).  Example : age[0]

		
		
		
		
		/*5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array
		 * 		 and add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[names.length];
			
		for (int i = 0; i < nameLengths.length; i++) { 
			nameLengths[i] = names[i].length(); //Adding the length of each element in the names array to nameLengths array at the same index position
		}

		
		
		/*6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		 * 		Print the result to the console.
		 */
		int sumNameLengths = 0; 
		
		for (int length : nameLengths) {
			sumNameLengths += length; //Calculating the sum of all the elements in the nameLengths array and storing the results in sumNameLenghts int variable
		}
		
		System.out.println(sumNameLengths);
		
		
		
		/*7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times.
		 * 		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello".
		 */

		String word = "Christmas";
		int n = 5;
		
		
		System.out.println(concatString(word, n));
		
		
		
		
		/*8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the 
		 * 		last name as a String separated by a space).
		 */
		
		String firstName = "John";
		String lastName = "Doe";
		
		System.out.println(fullName(firstName, lastName));
		
		
		
		
		//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int[] ints = {3, 7, 9, 45, 23, 78, 12};
		
		System.out.println(sumInts(ints));
		
		
		
		//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] doubleArray = new double[3];
		doubleArray[0] = 8.3;
		doubleArray[1] = 2.7;
		doubleArray[2] = 4.5;

		double ave = aveDouble(doubleArray);
		System.out.printf("%.02f %n", ave);
		
		
		
		/*11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater 
				than the average of the elements in the second array.
		*/
		
		double[] firstArray = {9.4, 9.9, 7.9};
		double[] secondArray = {1.2, 6.6, 9.9, 3.8, 8.4};
		
		System.out.println(compareArrays(firstArray, secondArray));
		
		
		/*12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot
		 *  outside and if moneyInPocket is greater than 10.50.
		 */
		boolean isHotOutside = true;
		double moneyInPocket = 6.90; 
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			/*This problem calculates the total price a family would have to pay to go to an amusement park with different prices for each type of family member (seniors, adults, and children). 
			 * I created a method that takes two lists, one that contains the different prices for each type of family member
			 * and and the other that contains the amount of family members that fit into each category (amount of seniors, amount of adults, and amount of children in the family).
			 * In the method, I ask the customer to enter the amount of people from each of the family member categories. Then I multiply the ticket price corresponding
			 * to the type of family member and add those three products to get the total price of the tickets. 
			 * 
			 * I created this because I wanted to use a couple of different concepts I have learned so far. I used two lists (initialized them in different ways), a for loop, a method,
			 * and I used the Scanner to get user input
			 */
			
		
		List<Double> ticketPrices = Arrays.asList(29.99, 39.99, 34.99);  //List of the prices for the park tickets, price of senior, adult, and children
		List<Double> familyMembers = new ArrayList<>(); //List of the amount of a retain family member (seniors, adults, and children), initialized in the method
		
		double total = parkTickets(familyMembers, ticketPrices);
		System.out.printf("$%.02f", total); //Prints the total price of the tickets to the user
		
		
		
	
	}
	
	
	
	//7. Method
		public static String concatString(String word, int n) {
			String concatWord = "";
			
			for (int i = 1; i <= n; i++) {
				concatWord += word; //Concatenates the word passed to the method by n number of times
			}
			
			return concatWord;
		}
		
		
		
	//8. Method
		public static String fullName(String firstName, String lastName) {
			String fullName = "";
			
			fullName += firstName + " " + lastName; //Concatenates the Strings firstName and LastName and stores the values in the fullName variable
			
			return fullName;
			
			
		}
		
		
		
	//9. Method
		public static boolean sumInts(int[] arrayInts) {
			int intSum = 0;
			
			for (int n : arrayInts) {
				intSum += n; //Calculates the sum of all the integers in the array
			}
			
			if (intSum > 100) {  //Returns true if the sum of the integers are greater than 100 and false if they are equal to or less than 100
				return true;
			} else {
				return false;
			}
				
			
		}
		
		
		
	//10. Method
		public static double aveDouble(double[] doubleArray) {
			double sumDouble = 0;
			for (double d : doubleArray) {
				sumDouble += d;  //Calculating the sum of the all of the doubles in the array of doubles
			}
			
			double aveDouble = sumDouble / doubleArray.length; //Calculating the average of all the elements in the array
			return aveDouble;
			
			
		}
	
	//11. Method
		public static boolean compareArrays(double[] firstArray,double[] secondArray) {
			double sumFirst = 0;
			double sumSecond = 0;
			
			for (double first : firstArray) {
				sumFirst += first;  //Calculating the sum of the all of the doubles in the firstArray
			}
			
			for (double second : secondArray) {
				sumSecond += second;  //Calculating the sum of the all of the doubles in the secondArray
			}
						
			
			double aveFirst = sumFirst / firstArray.length; //Calculating the average of all the elements in the firstArray
			double aveSecond = sumSecond / secondArray.length; //Calculating the average of all the elements in the secondArray
			
			if (aveFirst > aveSecond) { //Checks if the first array is greater than the second array. If it is it returns true but if it is less than or equal to the second array, it returns false.
				return true;
			} else {
				return false;
			}
			
		}
		
		
	//12. Method
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			if (isHotOutside && moneyInPocket > 10.50) { //Checks to see if isHotOutside is true and if value of moneyInPocket variable is greater than 10.50. Both need to be true to return true.
				return true;
			} else {
				return false;
			}
			
		}
		
		
	//13. Method
		public static double parkTickets(List<Double> familyMembers, List<Double> ticketPrices) {
			//Ask the user to enter the amount of seniors, adults and children in their family and adds it into the familyMembers list
			System.out.println("How many seniors are in your family: ");
			familyMembers.add(scanner.nextDouble());
			System.out.println("How many adults are in your family: ");
			familyMembers.add(scanner.nextDouble());
			System.out.println("How many children are in your family: ");
			familyMembers.add(scanner.nextDouble());
			
			double total = 0;
			
			for (int i = 0; i < ticketPrices.size(); i++) {
				total += (ticketPrices.get(i) * familyMembers.get(i)); //Multiplies the ticket prices corresponding to the type of family member (seniors, adults, and children) and adds each product to the total price of the tickets
			}
			
			
			return total;			
			
			
		}
			
			
			
	}
		


