#Assignment 6

####Vincent Davis
_______________________________________________________________________________________________________________
##1

34

##2
Attached images
![GitHub Logo](IMAG0560.jpg)

##3
```java

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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String input = scan.nextLine();
		if(palinCheck(input))
			System.out.println("What you put is a palindrome");
		else
			System.out.println("what you put is not a palindrome");
	}
}

```
##4
Think of logs as log base 2

L(n) = L(n/2) + 1 for n >= 2
You need a base case
L(n) = 1 for 0<= n < 2
L(n) = log(n) + 1
L(r) = L(r/2) + 1
L(r) = log(r/2) + 1 + 1
L(r) = log(r/2) + 2
L(r) = log(r/2) + log(4)
L(r) = log(4r/2)
L(r) = log(2r)
L(r) = log(2) + log(r)
L(r) = 1 + log(r)

r > n, L(r) = 1 + log(r)



##5
```Java
public int count7(int n){
		if(n == 0){
				return 0;
		  	}
    	if (n%10 == 7)  
    		return 1 + count7(n/10);
    	else
    		return 0 + count7(n/10);
	}
```
