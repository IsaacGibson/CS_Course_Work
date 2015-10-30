import java.util.Random;
import java.util.Scanner;
class  Assign3
{
    public static void main(String[] args)
     {
    	//Number 5

	int a,b,c,d,e,f;
	
	Random rand = new Random();
	a = rand.nextInt(11);
	b = rand.nextInt(501);
	c = rand.nextInt(10) + 1;
	d = rand.nextInt(500) + 1;
	e = rand.nextInt(26) + 25;
	f = rand.nextInt(26) - 10;
	System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);

	


	System.out.println("\n");
	System.out.println("Welcome to part 2!!");
	System.out.println("The company needs to know the optimal cost for a cylinder container");
	

	Scanner store = new Scanner(System.in);
	float volume, rad, height, cost, pi;
	pi = (float) 3.14159;
	
	System.out.print("Please input the amount of volume: ");
	volume = store.nextFloat();
	
	System.out.print("Please input the radious of the container: ");
	rad = store.nextFloat();
	
	System.out.print("Please input the height of the container: ");
	height = store.nextFloat();
	
	height = (float)(volume/(pi*(rad*rad)));
	cost = (float)(2*pi*rad*(rad + height));
	
	System.out.println("The cost will be $" + cost);
	
     }
}
