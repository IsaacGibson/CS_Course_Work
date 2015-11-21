import java.util.Arrays;

public class Assignment7<T extends Comparable<? super T>>{
	private static int[] a;
	
	//Number 1
	public int[] selectionSort(int[] x) {
	    for (int i=x.length - 1; i >= 0; i--) {
	        int maxIndex = i;      // Index of largest value
	        for (int j=i - 1; j>=0; j--) {
	            if (x[maxIndex] < x[j]) {
	                maxIndex = j;  // Remember index of new max
	            }
	        }
	        int highest = x[maxIndex];
	        x[maxIndex] = x[i];
	        x[i] = highest;
	    }
	  return x;
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
	
	
	//Number 4 
	/**
	 * When the pivot is either the first element or the last element
	 * and if the array is already sorted {1,2,3,4,5,6,7,8,9,20}
	 * Makes the complexity O(n^2)
	 * 
	 */
	
	//Number 5 
	public int[] search(Object[] x, Object object){
		int[] temp = new int[x.length];
		int oposite = 0;
		int[] search = {};
		for(int i = 0; i < x.length; i++){
			if (x[i].equals(object)){
				temp[oposite] = i;
				oposite++;
			}
		}
		search = new int[oposite];
		for (int r = 0; r < oposite; r++){
			search[r] = temp[r];
		}
		return search;
	}
	public static void main(String[] args) {
		Assignment7<Integer> select = new Assignment7<Integer>();
		int[] p = {2,7,3,4,1,8,6,9}; 
				
		select.bubbleSort(p);
		//select.quickSort(p);
		System.out.println(Arrays.toString(p));
		
		

	}

}
