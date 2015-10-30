import java.util.Scanner;


public class ItemsDriver{
	
	public static void main (String[] args)
	{

		Scanner n = new Scanner(System.in);
		SalesofItems putvariblenamehere = new SalesofItems(8, 10000);// cost of item, quantity
		System.out.println("SALES!!!");
		
		System.out.print("Enter discount here: ");
		double dis = n.nextDouble();
		System.out.print("Enter the amount sold here: ");
		int sold = n.nextInt();

		putvariblenamehere.setDis(dis); //Discounted at 10 percent
		putvariblenamehere.regiseterSale(sold);//sold over 10001
		putvariblenamehere.show();//display 
	}
}
