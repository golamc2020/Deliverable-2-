import java.util.Scanner;
public class myClass {

	public static final int NUM = 31; 

	// Function to calculate the position 
	// of characters 
	static void positions(String str, int n) 
	{ 
	    
		for (int i = 0; i < n; i++) { 

			// Performing AND operation 
			// with number 31 
			System.out.print((str.charAt(i) & NUM) + "-"); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String input;
	    System.out.println("What is your message? ");
		Scanner scan = new Scanner(System.in);
        String input1 = scan.next();

		System.out.println(input1.toUpperCase());
		
		
		System.out.println("Your encoded message is ");
		
		int n = input1.length(); 
		positions(input1, n); 
		
		char message1='J';
		char message2='A';
		char message3='V';
		char message4='A';
		
		int checksum=(message1+message2+message3+message4);

		System.out.println("\nMessage checksum is "+checksum);
		
	} 

}
