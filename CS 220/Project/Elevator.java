


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
		Elevator elevatorone = new Elevator(1, 20, 2);
		Floors floor = new Floors();
		
		//floor.goUp();
		//floor.goUp();
		System.out.println(floor.getFloor());
		System.out.println(elevatorone.getPeople());
		System.out.println(floor.isFull());
	}

}