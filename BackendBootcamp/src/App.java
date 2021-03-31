/*Create a new class in the project and name it App
 * @Author Wendy Sun
 * @Backend Bootcamp Week 1 Coding Assignment 
 */

public class App {

	/*
	 * Inside the main method, create one variable for each of the following 
	 * real-life examples and assign them values (choose the best data type for the values):
	*/
	public static void main(String[] args) {
		//Item price
		double itemPrice = 2.40; // change made by jeff1haupt (changed from 2.50)
		//Amount of money in wallet
		double moneyInWallet = 50.50;
		//Number of friends
		int numOfFd = 300;
		//Age in years (as a whole number)
		int age = 25;
		//First name
		String firstName = "Steve";
		//Last name
		String lastName = "Smith";		
		//Middle initial
		String middleInitial = "L";
		
		/*
		 * Create the following variables by performing operations 
		 * (addition, subtraction, concatenation) on the variables created in the previous step
		 */
		
		//New amount of money in wallet after buying the item
		  double newAmountMoney = moneyInWallet - itemPrice; 
		
		//Number of friends you�ve made each year based on your age variable and your number of friends variable
		  int numFdPerYear = numOfFd/age;
		
		//Full name based on first name, middle initial, and last name
		  String fullName = firstName +" " + middleInitial + " " + lastName;
		  
		/*
		 * Use System.out.println() to print out the values of all the variables you�ve created. 
		 * Provide some detail as to what the value being printed is. 
		 */
		  
		  System.out.println("New amount of money in wallet after buying the item is: " + newAmountMoney);
		  System.out.println("Number of friends you�ve made each year based on your age: " + numFdPerYear);
		  System.out.println("Full name is: " + fullName);
	}//end main

}//end App
