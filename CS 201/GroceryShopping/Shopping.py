'''
Grocery Shopping

Created on Sep 12, 2014

@author: Vincent
'''
budget = 50; 
print ("Your budget to shop is $50");
oranges = 0.50;
orange1 = int(input("How many oranges do you want to buy: "));
totalcost = oranges * orange1;
#step 1
if (orange1 >= 6):
    totalcost = totalcost - (totalcost * 0.15);
    print ("Your total is $" + str(totalcost));
    budget = budget - totalcost
    print ("Your current budget is $" + str(budget));
if (orange1 <= 6):
    budget = budget - totalcost;
    print ("Your total cost is $" + str(totalcost));
    print ("Your current budget is $" + str(budget));
#Set budget to eqaul 50
#A simple program that allows the user to input the amount of oranges they want. 
#If there are more than 6 oranges they get a 15% discount, print their total price.
#If there are less than 6 oranges they pay full price, write their current budget.

#Step 2
breakfest = input ("Enter 'o' for oatmeal($2.50) or 'm' for microwave meal($5.00): ");

if(breakfest == 'o'):
    budget -= 2.50;
    print ("Your current budget is $" + str(budget));
if(breakfest == 'm'):
    budget -= 5.00;
    print ("Your current budget is $" + str(budget));
#A simple part of the program that prompts the user to exactly what kind of food they want.
#Set oatmeal to equal 0. Set microwave meal to equal m. 
#Take the current budget minus the cost of the food they choose to get new budget. Write current budget.

#step 3
dinner = input ("Enter 'at' for meat or 'v' for vegetarian: ");

if (dinner == 'at'):
    meatchoice = input ("Enter 'c' for chicken($3.00 per pound) or 'b' for beef($5.00 per pound): ");
    if (meatchoice == 'c'):
        p = input ("How many pounds of chicken do you want: ");
        budget -= 3.00 * float(p);
        print ("Your current budget is $" +str(budget));
    if (meatchoice == 'b'):
        p = input ("How many pounds of beef do you want: ");
        budget -= 5.00 * float(p);
        print ("Your current budget is $" + str(budget));
if (dinner == 'v'):
    vegechoice = input ("Enter 't' for tofu ($4.50 per pound) or 'n' for nuts($7.00 per pound): ");
    if (vegechoice == 't'):
        p = input ("How many pounds of tofu do you want: ");
        budget -= 4.50 * float(p);
        print ("Your current budget is $" + str(budget));
    if (vegechoice == 'n'):
        p = input ("How many pound of nuts do you want: ");
        budget -= 7.00 * float(p);
        print ("Your current budget is $" + str(budget));
#A piece of the program that prompts the user if the want meat or vegetarian. 
#If they choose meat then they have to option either get chicken or beef per pound. Take the current budget minus the cost of the item multiplied by the number of pounds. Write new budget.
#If they choose vegetarian they are prompted with the option to either get tofu or nuts. take the current budget minus the cost of the item and multiply if by the number of pounds. Write new budget.

#Step 4 
if (budget >= 40):
    print ("Hmm... You might want to buy more food...");
elif (budget <= 40 and budget >= 20):
    print ("Good job! Have a great meal and enjoy the leftovers!! Go buy yourself a game...");
elif (budget <= 20 and budget >= 0):
    print ("You OVERSPENT!!! Make it last!! Remember you have to pay the bill.");
else:
    print("You overspent, put some items back on the shelf!");
#A piece of the program that writes a certain code if conditions that are set meet the specifications.

    