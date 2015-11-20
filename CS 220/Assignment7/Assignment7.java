import java.util.Arrays;

public class Assignment7<T extends Comparable<? super T>>{
	private static int[] a;
	
	//Number 1 | Need to fix
	public void selectionSort(int[] x) {
	    for (int i=x.length - 1; i >= 0; i--) {
	        int maxIndex = i;      // Index of largest value
	        for (int j=i+1; j>=0; j--) {
	            if (x[maxIndex] > x[j]) {
	                j = maxIndex;  // Remember index of new max
	            }
	        }
	        if (maxIndex != i) { 
	            //...  Exchange current element with smallest remaining.
	            int temp = x[i];
	            x[i] = x[maxIndex];
	            x[maxIndex] = temp;
	        }
	    }
	}
	
	//Number 2
	public static void bubbleSort(int[] needToSort){
		//Used yo sort n elements on the outside
		for(int i = 0; i < needToSort.length -1; i++){
			//Inner loop for comparison and swapping
			for(int j = 1; j < needToSort.length - i; j++){
				if(needToSort[j-1] > needToSort[j]){
					int temp = needToSort[j];
					needToSort[j] = needToSort[j - 1];
					needToSort[j-1]=temp;
				}
			}
		}
	}
	/** Number 3 
	 * T(n) = 2T(n/2) + n when n > 1
	 *       <= 2(c(n/2)log(n/2))+n
	 *       = cn log(n/2) + n
	 *       = cn log n - cn log 2 + n 
	 *       = cn log n - cn + n
	 *   T(n) = T([n/2]) + T([n/2]) + n is O(n log n)    
	 */
	
	
	//Number 4 | Need to fix
	T [] quickSort(T[] a){
		quickSort(a, 0, a.length -1);
		return a;
	}
	private void quickSort(T[] a, int low, int high){
		int i = low; int j = high;
		T pivot = a[low + (low + high)/2];
		while (i <= j){
			while(a[i].compareTo(pivot) < 0)
				i++;
			while(a[j].compareTo(pivot) > 0)
				j--;
			if (i <= j){
				swap(a, i, j);
				i++;
				j--;
			}
			if (low < j){
				quickSort(a, low, j);
			}
			if (i < high)
				quickSort(a, i, high);
		}
	}
	private void swap(T[] a, int i, int j){
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	//Number 5 | Need to fix
	public boolean holds(T stuff){
		int numberOfEnteries = ((String) stuff).length();
		boolean found = false;
		for(int index =0; !found && (index < numberOfEnteries); index++){
			if(anEntry.equals(list[stuff]))
				found = true;
		}
		return found;
	}

	public static void main(String[] args) {
		Assignment7<Integer> select = new Assignment7<Integer>();
		int[] p = {2,7,3,4,1,8,6,9}; 
				
		select.bubbleSort(p);
		//select.quickSort(p);
		System.out.println(Arrays.toString(p));
		
		

	}

}
