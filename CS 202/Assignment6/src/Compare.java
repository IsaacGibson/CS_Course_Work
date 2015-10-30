import java.util.Scanner;


public class Compare {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner text = new Scanner(System.in);
		System.out.print("Enter a Sentence: ");
		String word = text.nextLine();
		System.out.print("Enter another Sentence: ");
		String word2 = text.nextLine();
		char[] words = word.toCharArray();
		char[] words2 = word2.toCharArray();
		int smallNum;
		if(words.length< words2.length){
			smallNum = words.length;
		}
		else{
			smallNum = words2.length;
		}
		for(int j = 0; j < smallNum; j+= 1){
			char c = words[j];
			char c2 = words2[j];
			if(words[j] != words2[j])
				System.out.println(" "+ c + " and "+ c2);
			}
		if(words.length> words2.length)
			System.out.print(word.substring((words.length)-(words2.length))+": Your first sentence doesn't match your second sentence in length");
		else if(words.length<words2.length)
			System.out.print(word2.substring((words2.length)-(words.length))+": Your second sentence doesn't match your first sentence in length");
			}
	}
