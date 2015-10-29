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
