'''
Created on Sep 30, 2014
Budget Analysis

Factorialing

@author: Vincent
'''
budget = int(input("Enter the amount that you have budgeted for a month: "));
#set budget to equal the amount user inputs for budget
while 1: #infinite loop
    print("your total is $" + str(budget));
    print ("Enter 'y' for yes, 'n' for no");
    x = str(input("Do you want to enter expenses: "));
    #Write your total is concate string variable
    #set x to equal the amount user inputs in expenses
    if(x == 'y'):
        expenses = int(input("Enter the expense you've spent: "));
        budget -= expenses;
    #if x equals 'y', variable expenses equals user input
    #new variable budget equals old budget minus expenses 
    if (x == 'n'):
        break;
    #if x equal 'n', break loop

print("You have $" + str(budget));
#Write budget total if over or under

print ("WELCOME TO THE SECOND PROBLEM");
#Write welcome to second problem
factoring = 1;
#set variable to equal 1
while 1: #infinite loop
    x = int(input("Enter a number any number: "));
    #variable x equal to user input
    if x == 0:
        print("1");
        #if x equals to 0, Write 1
    if x < 0:
        print("Can't factorial a negative number");
        #if x less than 0, write Can't factorial negative number
    if x > 0:
        for x in range(1, x + 1): #count control loop
            factoring *= x;
        print("Factorial of",x ,"is", factoring);
        break;
    #if x greater than 0, count control loop range of 1 to x plus 1
    #new variable factoring is equal to old factoring times x
    #write the final variable factoral
    #break the loop
    

    
    
    


   
        
    
    
