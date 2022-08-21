import java.util.Scanner; 


public class AssignmentPreWork {
	static void MainMenu() {
		
		
		
	int userInput = userInputs(); // calling userInput method
	
	if(userInput < 0 || userInput > 4) { //checking if the user input is between 0-4;
		
		System.out.println("You have to choose between option 0 and 5 \n");
		
		MainMenu(); // calling MainMenu method if user input is not between 0-4
		
	}
	
	else {
		
	switch(userInput) { // implementing switch case
	
	case 0:	
		System.out.println("You have exited the program");
		System.exit(0);
		break;
		
	case 1:		
		System.out.println("Please enter a number to check if it is a palindrome numeber.");
		palindromeNumber();		
		break;
		
	case 2:		
		System.out.println("Enter a number above 1 to print stars in decreasing order");
		patternOfStars();		
		break;
		
	case 3:
		System.out.println("Enter a number to check if it is a prime number");
		primeNumber();		
		break;
		
	case 4:
		System.out.println("Enter a number to find its fibonacci size");
		fibonacciSeries();		
		break;
			
	}
	}
	}
	static int userInputs() { 
		
		Scanner opt = new Scanner(System.in); // implementing scanner object
		
		int num;
		
			while (!opt.hasNextInt()) { // checking if user option is a number
				
				opt.next();
				
				System.out.println("Please enter your option in numebers \n");
				
			}
			
			num = opt.nextInt();
			
			
			return num;

		
	}
	
	static void palindromeNumber() {
		
		int userInput = userInputs(); // calling userinputs
		
		String x = String.valueOf(userInput); // converting integer value to string
		
		//String y = "";
		int i = x.length()-1; // finding the length of characters in the string
		String y = "";
		// appending character in reverse 
		do {
			
			y = y + x.charAt(i); 
			
			i--;
			
		}while(i>=0);
		
		//System.out.println(y);
		
		if (x.equals(y)) { // checking if the original string is equal to the reversed string
			
			System.out.println(userInput+" is a palindrome number");
		}
		else {
			System.out.println(userInput+" is not a palindrome number");
		}
		System.out.println("\nChoose another function by entering input between 1-4 or 0 to exit");
		MainMenu();
	}
	
	static void patternOfStars() {
		
		
		
		int userInput = userInputs();
		
		if(userInput > 1) {
			
			int j;
			
			j = userInput;
			
			do {
				
				int i;
				
				i = j;
				
				do {
					
					System.out.print("* ");
					
					i--;
					
				}while(i > 0);
				
				System.out.println("");
				
				j--;
				
			}while(j >0);			
			
		}
			else {
				
				System.out.println("Please enter a value bigger than 1");
			
			patternOfStars();
			
		}
		System.out.println("\nChoose another function by entering input between 1-4 or 0 to exit");
		MainMenu();
	}
	
	static void primeNumber() {
		
		int userInput = userInputs();
		
		if (userInput > 1) {
			
			boolean check = false;
			
			int i = 2;
			
			do {
				if (userInput % i == 0 ) {
					check = true;
					break;
				}
				
				i++;
				
			}while(i <= userInput /2);
			
			if(check == false) {
				
				System.out.println(userInput + " is a Prime number.");
				
			}else {
				
				System.out.println(userInput + " is not a Prime number.");
			}
			
		} else {
			
			System.out.println("Input a number bigger than 1");
			
			primeNumber();
			
		}
		System.out.println("\nChoose another function by entering input between 1-4 or 0 to exit");
		MainMenu();
				
	} 
	
	static void fibonacciSeries() {
		System.out.println("Enter a number to find the fibonacci sequence until its length");
		
		int userInput = userInputs();
		
		int n1, n2, count;
		
		n1 = 0;
		
		n2 = 1;
		
		count = 0;
		
		while(count < userInput) {
			
			String x = (count == userInput -1) ? "" : ", "; 
			
			System.out.print(n1+x);
			
			int n3 = n1 + n2;
			
			n1 = n2;
			
			n2 = n3;
			
			count++;

		}
		System.out.println("\nChoose another function by entering input between 1-4 or 0 to exit");
		MainMenu();
	

		
	}
	
	public static void main(String[] args ) {
		
		System.out.println("Choose your option\n");
		// printing options numbers
        System.out.println("0. Exit the program" );
		
		System.out.println("1. Check for palindrone number" );
		
		System.out.println("2. Print the pattern of stars in decreasing order based on the input");
		
		System.out.println("3. Check if a number is a prime number");
		
		System.out.println("4. Print the Fibonacci sequence of length given by user");
				
		
		
	MainMenu(); // calling MainMenu method
	
	}
}
