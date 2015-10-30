import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		//NUMBER ONE
		for(int i = 1; i <= 10; i++){
			for(int r = 1; r <= 10; r++){
			System.out.print(i*r + "\t");
			}
			System.out.print("\n");
		}
		//Number Two
		System.out.println();
		Random num = new Random();
		Scanner take = new Scanner(System.in);
		System.out.println("Hi I'm SAI and I'm thinking of a number between 1 and 100");
		int companswer = num.nextInt(100) + 1;
		int guesses = 0;
		int answer;
		while (true){
			System.out.println("If you wish to leave hit (0)");
			System.out.print("Enter your guess: ");
			answer = take.nextInt();
			if (answer == 0)
				break;	
			else if (answer == companswer){
				System.out.println("That's correct");
				break;
				}
			else if (answer < companswer)
				System.out.println("You're Too low \n");
			else 
				System.out.println("You're Too High \n");
			guesses++;
		}
		if (answer != companswer){
			System.out.println("It took you " + guesses +" tries.");
			System.out.println("The computer's answer was "+ companswer);
		}
		else 
			System.out.println("It took you " + guesses +" tries.");
		
	}

}
