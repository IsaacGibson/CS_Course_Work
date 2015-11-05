#Assignment 6

####Vincent Davis
_______________________________________________________________________________________________________________
##1

0301013601014020246


##2
Attached images
![GitHub Logo](IMAG0560.jpg)

##3
```java

public class Palindrome{

	public static boolean palinCheck(String stuff){
		if(stuff.length() == 0 || stuff.length() == 1)
			return true;
		if(stuff.charAt(0) == stuff.charAt(stuff.length() - 1))
			return palinCheck(stuff.substring(1, stuff.length()-1));
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String input = scan.nextLine();
		if(palinCheck(input))
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}
}

```
##4


##5


