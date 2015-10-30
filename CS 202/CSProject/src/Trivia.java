import javax.swing.*;

//Inheritance Jpanel
public class Trivia extends JPanel{
	
	//Need serial for JPanel
	private static final long serialVersionUID = 1L;
	private int tries = 3;
	
	public Trivia(){
		
	}

	//First Method
	public void Riddle1(){
		//Contains the game inside a infinite while loop
		//The Label (loop) is here so that we can break out of the switch case and the loop
		loop: while(true){
		 String[] options = { "Bib Fortuna ", "Salacious Crumb", "Padme Amidala", "Leia Organa"};
		 
            String game = (String) JOptionPane.showInputDialog(null, "He was the Kowakian monkey-lizard employed as court jester by Jabba the Hutt. But do you know his name?",
				 "Trivia Game", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		 
		 switch (game){
		 	case "Salacious Crumb":		 		
		 		JOptionPane.showMessageDialog (null, "  YOUR ANSWER IS CORRECT!!!!!", "Trivia Game", JOptionPane.PLAIN_MESSAGE);
		 		//break out of switch case and loop
		 		break loop;
		 	default:
		 		tries -= 1;
		 		JOptionPane.showMessageDialog (null, "WRONG ANSWER, tries: " + tries , "Trivia Game", JOptionPane.ERROR_MESSAGE);
		 		}
		 if(tries == 0)
			 //Ends game completely
			 System.exit(0);
		}
	}	
	public void Riddle2(){
		loop: while (true){
			 String[] options = { "it was a film abreviation - Reel 2, Dialogue 2?", "it was from his postcard", "it was part of his number plate"};
			 String game = (String) JOptionPane.showInputDialog(null, "How did R2-D2 get its name?",
					 "Trivia Game", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
			 
			 switch (game){
			 	case "it was a film abreviation - Reel 2, Dialogue 2?":		 		
			 		JOptionPane.showMessageDialog (null, "YOUR ANSWER IS CORRECT", "Trivia Game", JOptionPane.INFORMATION_MESSAGE);
			 		break loop;
			 	default:
			 		tries -= 1;
			 		JOptionPane.showMessageDialog (null, "WRONG ANSWER, tries: " + tries , "Trivia Game", JOptionPane.ERROR_MESSAGE);
			 		}
			 if (tries == 0)
				 System.exit(0);
				}
			}
	public void Riddle3(){
		loop: while (true){
			 String[] options = { "Cold", "Ship", "Hello", "Am I to become a Jedi"};
			 String game = (String) JOptionPane.showInputDialog(null, "What was Anakins first words to Yoda's in the Phantom Menance?",
			 "Trivia Game", JOptionPane.QUESTION_MESSAGE, null, options, options[3]);
			 
			 switch (game){
			 	case "Cold":
			 		JOptionPane.showMessageDialog (null, "YOUR ANSWER IS CORRECT", "Trivia Game", JOptionPane.INFORMATION_MESSAGE);
			 		break loop;
			 	default:
			 		tries -= 1;
			 		JOptionPane.showMessageDialog (null, "WRONG ANSWER, tries: " + tries , "Trivia Game", JOptionPane.ERROR_MESSAGE);
			 		}
			 if (tries == 0)
		 			System.exit(0);
			}	
		}
	
	public void Riddle4(){
		loop: while (true){
			 String[] options = { "Corellia", "Alderaan", "Endor", "Nar Shaddaa"};
			 String game = (String) JOptionPane.showInputDialog(null, "What planet is Han Solo from?",
			 "Trivia Game", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
			 
			 switch (game){
			 	case "Corellia":		 		
			 		JOptionPane.showMessageDialog (null, "YOUR ANSWER IS CORRECT", "Trivia Game", JOptionPane.INFORMATION_MESSAGE);
			 		break loop;
			 	default:
			 		tries -= 1;
			 		JOptionPane.showMessageDialog (null, "WRONG ANSWER, tries: " + tries , "Trivia Game", JOptionPane.ERROR_MESSAGE);
			 		}
			 if (tries == 0)
		 			System.exit(0);
			}	
		}
		
	public void Riddle5(){
		loop: while (true){
			 String[] options = { "Neva Kee", "Sebulba", "Ratts Tyrell", "Ben Quadrinaros" };
			 String game = (String) JOptionPane.showInputDialog(null, "Which Podracer is the first to explode in the Phantom Menace?",
			 "Trivia Game", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (game){
			 	case "Ratts Tyrell":		 		
			 		JOptionPane.showMessageDialog (null, "YOUR ANSWER IS CORRECT", "Trivia Game", JOptionPane.INFORMATION_MESSAGE);
			 		break loop;
			 	default:
			 		tries -= 1;
			 		JOptionPane.showMessageDialog (null, "WRONG ANSWER, tries: " + tries , "Trivia Game", JOptionPane.ERROR_MESSAGE);
			  }
			 if (tries == 0)
		 			System.exit(0);
			 }
		}
}


