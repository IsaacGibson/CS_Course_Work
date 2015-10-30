import java.util.Scanner;

public class MotorBoat{

	private final int capacity, max_speed; //fuel tank capacity, max speed in miles per hour
	private double fuelamount, efficiency, distance, time_spent;//time spent in hours
	private int speed, have, refuel; //miles per hour,

	//constructor
	public MotorBoat()
		{
		max_speed = 100;
		capacity = 70;
			}

	//Method to calculate the amount of fuel used
	public void fuel()
		{
		double used_fuel = ((speed*speed)*efficiency*time_spent);
		have = (int) (capacity - used_fuel);
		System.out.println("You have "+ have+" gallons left");
		}
	

	//Refuel method
	public void Refuel()
		{
		refuel = 1;//only get one extra gallon
		have += refuel;
		distance = speed * time_spent;
		time_spent += 1;
		}

	//Method to calculate the Distanced traveked
	public void Distance(int speed, int time_spent, double efficiency)
		{  
		this.speed = speed;
		this.time_spent = time_spent;
		this.efficiency = efficiency;
		this.distance = speed * time_spent;
		}

	//Method for speed change
	public void changespeed(int change)
		{
		speed += change;
		if (speed > max_speed){
			System.out.println("You can't exceed Max speed of " + max_speed + " mph");
			System.exit(0);
			} 

		}

	//This is my display method
	public void Boat()
		{
		System.out.println("Your traveling at a speed of " + speed + " mph for " + time_spent + " hours");
		fuel();//call my fuel Method
		System.out.println("You have traveled " + distance + " miles");
		}


}
