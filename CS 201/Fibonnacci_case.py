def pas (start, num): #pass over function
	fib = [] #set variable fib to equal array
	number = 1 #set variable number to equal one
	q = 0 #set variable q to equal zero
	fib.append(start) #add variable start to end of array
	fib.append(number) #add variable number to end of array
	
	for fibonacci in range(0, num):# count control loop (zero to variable num(user input))
		start = q #set start to equal q (so when loop pervious variable q equals new variable start)
		q = number #set q to equal number (so when loop pervious variable number is equal to new variable q)
		number = start + q #set number to equal start plus q 
		if(num >= number): #if num(user input) greater or equal to number	
			fib.append(number) #then add number to end of array
			
	print(fib) #print the array
		
	
def main(): #def main
	start = 0 #set start to equal zero
	num = int(input("Enter a number you want to fibonacci here: ")); #set variable num which is the end value to equal user input
	x = pas(start, num); #pass over function
	
if (__name__ == '__main__'):#set the special __name__ variable to have a value "__main__"
	main();	#call main
