
import java.util.Scanner;


class  Assign
{
    public static void main(String[] args)
     {
	Scanner scan = new Scanner(System.in);
       System.out.print("Please enter your name: ");
	String name = scan.nextLine();
	System.out.print("Please enter your college: ");
	String college = scan.nextLine();
	System.out.print("Please enter your pet's name: ");
	String pet = scan.nextLine();
	System.out.print("Please enter your age: ");
	int age = scan.nextInt();
	System.out.println("Hello my name is " + name + " and I am " + age + " years old.\n"
			+ "I'm enjoying my time at " + college + ", though\n" +
			"I miss my pet " + pet + " very much!");



	//Number 2
	System.out.print("\n");
	System.out.println("Welcome to number 2");
	float num1, num2, sum, differ, product;
	System.out.print("Enter a number: ");
	num1 = scan.nextFloat();
	System.out.print("Enter a second number: ");
	 num2 = scan.nextFloat();
	//num1 = (float)1002.3;
	//num2 = (float)80.9;
	sum = num1 + num2;
	differ = num1/num2;
	product = num1*num2;
	System.out.print("The sum of " + num1 + " and " + num2 + " is " + sum + ".\n" +
			"The difference of " + num1 + " and " + num2 + " is " + differ +".\n" +
			"The product of " + num1 + " and " + num2 + " is " + product+ ".");  
	


     }
}
