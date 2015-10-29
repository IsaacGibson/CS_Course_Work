import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vince
 *
 */

//Just for practice not my work

public class StackDeque{
	public static void main(String args[]){
			Deque deque = new LinkedList<>();

	        deque.push("Johnny");
	        deque.push("Timmy");
	        deque.push("Roshonda");
	        deque.push("Felisha");
	        if(deque.isFull()){
			deque.removeFirst();
	        }
	        System.out.println(deque + "\n");
	    }
		
}  
		


