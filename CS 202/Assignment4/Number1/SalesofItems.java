
public class SalesofItems{

	private int sold, quantity; //amount sold, total Bulk quantity 
	private double sales, discounts, cost, BDis;//total sales, discount value, cost per item, Discount percentage
	
	//Constructor
	public SalesofItems(double cost, int quantity)
	{
		//use to change value
		this.cost = cost; 
		this.quantity = quantity;
	}

	//Method used to get sales
	public void regiseterSale(int total)
	{
		//If total less then quantity run code, else run code
		if (total < quantity)
		{
			sales += cost*total;
			sold += total;	
		}
		
		if (total > quantity)
		{
			sales += (cost - (cost*BDis))*total;
			discounts += BDis*cost*total;
			sold += total;
		}
	}
	
	//Method used to diplay those sales
	public void show()
	{
		System.out.println("Sales: $" + sales);
		System.out.println("Total amount sold: " + sold);
		System.out.println("Discounted: $" + discounts);
	}			

	//Method has data type double gonna return whatever is inputed into it
	//It's also the getter
	public double getBDis()
	{
		return BDis;
	}
	//This is the setter, sets a value to be another value
	public void setDis(double Dis)
	{	
		BDis = Dis;
	}
}
