import random
from graphics import *
 
#import random module


def callback():
	main();

def graphics():
	win = GraphWin();
	win.draw(win);
def main():
	graphics();
	print("Hi I'm SAI and i'm thinking of a number between 1 and 10,000");
	print("You Have ten tries");
	companswer = random.randint(1, 10000);
	tries = 10;
	while 1:
		print ("You have" ,tries, "left");
		try:	
			answer = input("Guess what it is: ")
			answer = int(answer) 	
			if(answer == int(answer)):
				if(tries == 0):
					print("You Suck DICK BITCH!!!")
					print("The right answer is", companswer, "\n");
					c = str(input("Do you want to try again: ", "\n"));
					if (c == 'y'):
						callback();
					else:
						break;
				if(answer == companswer):
					print ("YAH!!! You got it");
					break;
				elif(answer < companswer):
					print("Nope")
					print ("Need to go Higher \n");
					tries -= 1;
				elif(answer > companswer):
					print("Nope")
					print ("Need to go Lower \n");
					tries -= 1
	
		except (ValueError, TypeError, RuntimeError, NameError): #3 types of Errors, 1. TypeError 2. RuntimeError 3. NameError
			print("Negro please enter something correct \n");
		
main();

