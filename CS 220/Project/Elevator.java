

interface Elevate{
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

public class Elevator{
	private static int people;
	public Elevator previous;
	public Elevator next;
	
	public Elevator(Elevator previous, int people, Elevator next){
		previous = null;
		this.people = people;
		this.next = null;
	}

	//gets the amount to people on elevator
	public int getPeople(){
		return people;
	}


	private static class Floors implements Elevate{
		private Elevator head;
		private int floor;
		private final int size;

		//how many floors there are
		public Floors(){
			head = null;
			size = 17;
			floor = 1;
		}

		public void goUp(){
			if(head == null)
				head = new Elevator(null, people, null);
			else{
				Elevator newLink = new Elevator(null, people, head);
				head.previous = newLink;
				head = newLink;
			}
			floor++;

		}

		public void goDown(){
			if(head == null) 
				return;
			head = head.next;
			head.previous = null;
			floor--;
		}

		public int getFloor(){
			return floor;
		}

		public void goToFloor(int f){
			while (floor != f){
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
		Floors floor = new Floors();
		
		floor.goUp();
		floor.goUp();
		System.out.println(floor.getFloor());
	}

}