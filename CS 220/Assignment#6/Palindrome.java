import java.util.Scanner;
//Vincent Davis
//CS 220 Assignment #5

/**Number 1
34
*/

/**Check Attached pics
*/

//Number 3
public class Palindrome{

	public static boolean palinCheck(String stuff){
		if(stuff.length() == 0 || stuff.length() == 1){
			return true;
		}
		else if(stuff.charAt(0) == stuff.charAt(stuff.length() - 1)){
			return palinCheck(stuff.substring(1, stuff.length()-1));
		}
		else{
			return false;
		}
	}
	
	//Number 5
	public int count7(int n){
		if(n == 0){
				return 0;
		  	}
    	if (n%10 == 7)  
    		return 1 + count7(n/10);
    	else
    		return 0 + count7(n/10);
	}

	public static void main(String[] args) {
		Palindrome pal = new Palindrome();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String input = scan.nextLine();
		if(palinCheck(input))
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");

		//Number 5
		System.out.println("---------------------------------------------");
		System.out.print("Enter a number: ");
		int in = scan.nextInt();
		System.out.println(pal.count7(in));

	}
}

/**Number 4
Think of logs as log base 2

L(r) = L(r/2) + 1 for r >= 2
You need a base case
L(r) = 1 for 0<= r < 2
L(r) = log(r) + 1
L(r) = L(r/2) + 1
L(r) = log(r/2) + 1 + 1
L(r) = log(r/2) + 2
L(r) = log(r/2) + log(4)
L(r) = log(4r/2)
L(r) = log(2r)
L(r) = log(2) + log(r)
L(r) = 1 + log(r)

r > n, L(r) = 1 + log(r)
*/