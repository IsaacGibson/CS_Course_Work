'''
Created on Sep 30, 2014
Budget Analysis

Factorialing

@author: Vincent
'''

while 1:
	try:
		budget = int(input("Enter the amount that you have budgeted for a month: "));
		budget = int(budget);
		break;
		#set budget to equal the amount user inputs for budget
	except (ValueError, RuntimeError, TypeError, NameError):
		print ("Invaliad input \n");
while 1: #infinite loop
	try:
		print("your total is $" + str(budget), "\n");
		print ("Enter 'y' for yes, 'n' for no");
		x = str(input("Do you want to enter expenses: "));
		x = str(x);
    		#Write your total is concate string variable
    		#set x to equal the amount user inputs in expenses
		if(x == 'y'):
			expenses = int(input("Enter the expense you've spent: "));
			expenses = int(expenses);
			budget -= expenses;
    		#if x equals 'y', variable expenses equals user input
    		#new variable budget equals old budget minus expenses 
		if (x == 'n'):
			break;
	except(ValueError, TypeError, RuntimeError, NameError):
		print ("Invaliad input \n");
    #if x equal 'n', break loop

print("You have $" + str(budget));
#Write budget total if over or under

print ("WELCOME TO THE SECOND PROBLEM");
#Write welcome to second problem

factoring = 1;

while factoring <= 1:
	try:
		fact = int(input("Enter a number b****: "));
		fact = int(fact);
		if (fact == 0):
			print ("1");
		elif (fact < 0):
			print ("You can't have a negative factorial \n");
		elif (fact > 0):
			for fact in range (1, fact + 1):
				factoring *= fact;
			print ("Factorial of", fact, "is", factoring);
	
				
	except(ValueError, RuntimeError, NameError, TypeError):
		print("Invailed input Jerk \n");   
    


   
        
    
    
