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
class QueuBase{
  //All private because it only needs to be accessed within this class
  private Node firstNode;
  private Node lastNode;
  private T data;


  /**It's protected because you only want to have your child classes to
  to be able to see and have the access to add objects to the queues
   */
  protected void addToFront(T newEntry);
  /**It's protected because only the classes that inherit this class
   need access to the this method, method wouldn't be used for stack
   */
  protected void addToBack(T newEntry);
  /*Protected because it removes the front of the queue,
    You need your child classes to be able to remove from front of queue,
    method wouldn't be used for stack
   */
  protected T removeFront();
  /*Protected because it removes the back of the queue,
    You need your child classes to be able to be able to remove from back of queue
    or last part of stack
   */
  protected T removeBack();
  /**Should be public because all it's 
    doing is getting the front of the queue
   */
  public T getFront();
  /**It's public because the public needs to have the ability
    to get the back of the queue
   */
  public T getBack();
  /**It's public because all it's doing is checking
    if the queue is Empty or not 
   */
  public boolean isEmpty();
  /**It's protected because only the child classes need to have the ability to
    make the queue, deque, or stack empty
   */
  protected void clear();
  /**private because it only needs to 
  be accessed within this class
  */
  private class Node{

  }
  public class Queue<T> extends QueueBase<T> {

    public void offer(T newEntry) {
      Node newNode = new Node(lastNode, newEntry, null);
      lastNode = newNode;
    }
  }

  public class Stack<T> extends QueueBase<T> {

    public void push(T newEntry) {
      Node newNode = new Node(null, newEntry, firstNode);
      firstNode = newNode;
    }
  }

  public class Deque<T> extends QueueBase<T> {

  }
}
```
### 3

```Java
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Vince
 *
 */
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
```
### 4
```Java
public void splice(QueueInterface<T> anotherQueue) {
  while (!anotherQueue.isEmpty) {
    offer(anotherQueue.poll());
    }
}
```
### 5
```Java
public T removeBack() {
  if(backIndex < (dequeArray.length - 1)){
    int index = backIndex;
    backIndex = (backIndex - 1) % dequeArray.length;
    return dequeArray[index];
  }
  else {
    return null;
  }
}
public void addToBack(T newEntry){
  if(!isFull()) {
    backIndex = (backIndex + 1) % dequeArray.length; 
    dequeArray[backIndex] = newEntry;
  }
  else {
    ensureCapacity();
    addToBack(newEntry);
  }
}

public void addToFront(T newEntry){
  if(backIndex < (dequeArray.length - 1)){
    frontIndex = (frontindex + 1) % dequeArray.length; 
    dequeArray[frontIndex] = newEntry;
  }
  else {
    ensureCapacity();
    addToFront(newEntry);
  }
}
public T removeFront() {
  if(!isEmpty()){
    int index = frontIndex;
    frontIndex = (frontIndex + 1) % dequeArray.length;
    return dequeArray[index];
  }
  else {
    return null;
  }
}


```


