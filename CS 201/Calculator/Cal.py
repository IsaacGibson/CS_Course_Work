'''
Created on Sep 22, 2014

@author: Vincent
'''
bre = 0;
while 1:
    print("Enter '+' for Addition, '-' for subtraction, '*' for multiplication, '/' for Division");
    print("Enter '%' For the remainder off, '**' for exponent");
    print("Type 'quit' to exit");
    
    answer = str(input("What Mathematical operation do you want: "));
    if (answer == '+'):
        x = float(input("Enter first number here: "));
        y = float(input("Enter second number here: "));
        z = x + y;
        print("answer equals", z);
    if (answer == '-'):
        x = float(input("Enter first number here: "));
        y = float(input("Enter second number here: "));
        z = x - y;
        print("answer equals", z);
    if (answer == '*'):
        x = float(input("Enter first number here: "));
        y = float(input("Enter second number here: "));
        z = x * y;
        print("answer equals", z);
    if (answer == '/'):
        x = float(input("Enter first number here: "));
        y = float(input("Enter second number here: "));
        z = x / y;
        print("answer equals", z);
    if (answer == '**'):
        x = float(input("Enter first number here: "));
        y = float(input("Enter second number here: "));
        z = x ** y;
        print("answer equals", z);
    if (answer == '%'):
        x = float(input("Enter first number here: "));
        y = float(input("Enter second number here: "));
        z = x % y;
        print("answer equals", z);
    if (answer == 'quit'):
        break;
