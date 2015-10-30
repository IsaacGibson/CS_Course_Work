import java.io.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextFile {
	
	public static void main(String[] args) throws IOException
	{
		
		try{
			
			File read = new File("Num.txt");
			Scanner scan = new Scanner(read);
			int[] user = new int[scan.nextInt()];
			
			while(scan.hasNext()){
				for(int i = 0; i < user.length; i++){
					user[i] = scan.nextInt();
				}
			}	
			
			for(int i: user){
				String get = Integer.toString(i);
				System.out.println(get);
			}
			scan.close();
		
		}
		catch(NoSuchElementException e){
			System.out.println(e);
		}
	}

}
