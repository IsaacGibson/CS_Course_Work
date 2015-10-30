import java.util.Scanner;

public class MotorBoat_Driver{

	public static void main (String[] args)
	{
		MotorBoat program = new MotorBoat();//call class created Motorboat
		System.out.println("Welcome to MotorBoating 101!!");
		Scanner stuff = new Scanner(System.in);//calling scanner class to get user input
		

		//User input
		System.out.print("Enter the speed you want to travel at: ");
		int s = stuff.nextInt();
		System.out.print("Enter the effiency of the travel: ");
		double e = stuff.nextDouble();
		System.out.print("Enter the time spent: ");
		int t = stuff.nextInt();

		program.Distance(s, t ,e);//speed in mph, time in hours, effiency
		program.Boat();//Display Method


		System.out.print("Enter the speed you want to add to your speed: ");
		int change = stuff.nextInt();
		program.changespeed(change);//speed in mph
		program.Refuel();//refuel the boat
		program.Boat();//Display Method

	}
} 
