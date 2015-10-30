import java.util.Scanner;

public class IntType{

	public static void main (String[] args){

	Scanner input = new Scanner(System.in);
	System.out.print("User input your number here: ");
	int num = input.nextInt();
	//if else statement 
	if (num % 2 == 0)// if number user input modules (remainder 2 is equal to zero then
	{
		System.out.println("Your number is even"); 
	}
	else//else then
	{
		System.out.println("Your number is odd");
	}

	if (num == 0)
	{
		System.out.println("Youre number is zero");
	}

	}

}
