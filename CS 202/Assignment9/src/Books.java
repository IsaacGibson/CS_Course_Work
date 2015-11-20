
public class Books {
	public static int page;
	public String mainChar;
	
	public void message(){
		System.out.println("I am a book");
	}
	
	public void material(){
		System.out.println("I am made out of paper");
	}
	public void setChar(String character){
		mainChar = character;
	}
	public String getChar(){
		return mainChar;
	}
	
	public void setNumOfPage(int pagg){
		page = pagg;
	}
	public int getPage(){
		return page;
	}
	
}

class Novels extends Books{
	@Override
	public void message(){
		System.out.println("I am a novel");
	}
}
class Magazines extends Books{
	@Override
	public void message(){
		System.out.println("I am a magazine");
	}
	
}
class Journals extends Books{
	@Override
	public void message(){
		System.out.println("I am a journal");
	}
}
class textbooks extends Books{
	@Override
	public void message(){
		System.out.println("I am a textbook");
	}
}
