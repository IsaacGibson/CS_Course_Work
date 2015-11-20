import java.util.Scanner;

public class NumberAboveAverage {
	
	public static void main(String[] args){		
		int count = 1;
		double sum = 0;
		Scanner getTemp = new Scanner(System.in);
		double[] temp = new double[10];
		
		System.out.println("Welcome to the city tell me the temperature for each day");
		for(int i = 0; i < temp.length; i++){
			System.out.print("Enter tempture for " + count + " day: ");
			temp[i] = getTemp.nextFloat();
			count++;
		}
		
		for(double temperature: temp)
			sum += temperature;
		double average = sum/temp.length;
		System.out.println();
		System.out.println("The average is tempture is " + average + " degrees");
		
		int daysAboveAverage = 0;
		for (int i = 1; i < temp.length; i++){
			if(temp[i] > average){
				daysAboveAverage++;
				System.out.print(temp[i] + " ");
			}
		}
		System.out.println("The temperature was above average for " + daysAboveAverage + " days");
	}

}
