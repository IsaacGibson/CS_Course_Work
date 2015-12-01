
import java.util.Random;
import java.util.Scanner;

interface Elevate<E>{
	public void goUp();
	public void goDown();
	public int getFloor();
	public void goToFloor(int f);
	//Check to see if elevator is filled with people
	public boolean isFull();
	//Goes to the bottom floor
	public void goToBottomFloor();
	public boolean isEmpty();
}

public class Elevator <E>{
	private static int people;
	public E previous;
	public E next;
	
	public Elevator(E previous, int people, E next){
		previous = null;
		Elevator.people = people;
		this.next = null;
	}

	
	public Elevator(int people, Object next) {
		this.people = people;
		this.next = (E) next;
	}


	//gets the amount to people on elevator
	public int getPeople(){
		return people;
	}


	private static class Floors<E> implements Elevate<E>{
		private Elevator<E> head;
		private int floor;
		private final int size;

		//how many floors there are
		public Floors(){
			floor = 1;
			head = null;
			size = 17;
		}

		public void goUp(){
			if(head == null)
				head = new Elevator(null, people, null);
			else{
				Elevator newLink = new Elevator(null, people, head);
				head.previous = (E) newLink;
				head = newLink;
			}
			floor++;

		}

		public void goDown(){
			if(head == null) 
				return;
			head = (Elevator) head.next;
			head.previous = null;
			floor--;
		}
		public int getTopFloor(){
			return size;
		}

		public int getFloor(){
			return floor;
		}

		public void goToFloor(int f){
			while (floor != f && floor != size){
				if(floor > f)
					goDown();
				else
					goUp();
			}
		}

		//Check to see if elevator is filled with people
		public boolean isFull(){
			return people == 20;
		}
		
		//Goes to the bottom floor
		public void goToBottomFloor(){
			while (floor != 1){
				goDown();
			}

		}

		public boolean isEmpty(){
			return people == 0;
		}

	}

	public static void main(String[] args) {
		Random people = new Random();
		Scanner scan = new Scanner(System.in);
		Floors floor = new Floors();
		Elevator elevatorone = new Elevator(floor.getFloor(), people.nextInt(20), floor.getFloor());
	
		System.out.println("Welcome To my Elevator Game!!! \n"
							+ "The point of the Game Is to reach the top floor (17) you must input a random number of people between 1-20 \n"
							+ "If the Number is too many you will go down to the bottom floor, if right you advance to the next floor \n" 
							+ "Each time you advance a floor a random number of people will be getting off. Good Luck!!!");
		System.out.println("_________________________________________________________________________________________________________________");
		while (floor.floor != floor.getTopFloor()){
			System.out.println("Enter a random number of people: ");
			int move = scan.nextInt();
			if (elevatorone.people > move){
				floor.goUp();
				System.out.println("You are on floor " + floor.getFloor());
			}
		}
		
		
		
		
	}

}