# Assignment 5
_________________________________________________________________________________________________________________________________
Vincent Davis

### 1

You can test if the split in strings have certain properties by using two queues.
Once you find the middle of the strings put the first half in one queue and the other in the other.
Finally you compare if the two strings are equal if they are not then you know the word is 
not equal.

### 2

```Java
interface DequeInterface<T>{
	/**It's public because you need to let people have 
	access to add ojects to the queue 	
	*/
	 public void addToFront(T newEntry);
	 /**It's public public because users need to add to the back
	 of the queue
	 */
	 public void addToBack(T newEntry);
	 /*Public because it removes the front of the queue,
	 You need user to be able to remove from front of queue
	 */
	 public T removeFront();
	 /*Public because it removes the back of the queue,
	 You need user to be able to remove from back of queue
	 */
	 public T removeBack();
	 /**Should be public because all it's 
	 doing is getting the front of the queue
	 */
	 public T getFront();
	 /**It's public because the public needs to have the ability
	 to dequeue from the stack
	 */
	 public T getBack();
	 /**It's public because all it's doing is checking
	 if the queue is Empty or not 
	 */
	 public boolean isEmpty();
	 /**It's public because the user needs to have the ability to
	 make the queue empty
	 */
	 public void clear();
}

```
### 3

```Java
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Vince
 *
 */


public class StackDeque{
	public static void main(String args[]){
		 	Deque deque = new LinkedList<>();
	        // We can add elements to the queue in various ways
	        deque.add("Element 1 (Tail)"); // add to tail
	        deque.addFirst("Element 2 (Head)");
	        deque.addLast("Element 3 (Tail)");
	        deque.push("Element 4 (Head)"); //add to head
	        deque.offer("Element 5 (Tail)");
	        deque.offerFirst("Element 6 (Head)");
	        deque.offerLast("Element 7 (Tail)");
	        
	        System.out.println(deque + "\n");

	        // Iterate through the queue elements.
	        System.out.println("Standard Iterator");
	        Iterator iterator = deque.iterator();
	        while (iterator.hasNext()) {
	            System.out.println("\t" + iterator.next());
	        }
	        
	        // Reverse order iterator
	        Iterator reverse = deque.descendingIterator();
	        System.out.println("Reverse Iterator");
	        while (reverse.hasNext()) {
	            System.out.println("\t" + reverse.next());
	        }
	        
	        // Peek returns the head, without deleting it from the deque
	        System.out.println("Peek " + deque.peek());
	        System.out.println("After peek: " + deque);
	        
	        // Pop returns the head, and removes it from the deque
	        System.out.println("Pop " + deque.pop());
	        System.out.println("After pop: " + deque);
	        
	        // We can check if a specific element exists in the deque
	        System.out.println("Contains element 3: " + deque.contains("Element 3 (Tail)"));
	        
	        // We can remove the first / last element.
	        deque.removeFirst();
	        deque.removeLast();
	        System.out.println("Deque after removing first and last: " + deque);   
	    }
		
}
```
### 4

### 5
