#-------------------------------------------------------------------------------
# Name:        Assignment3 Grade book
# Purpose:      Grade
#
# Author:      Vincent
#
# Created:     11/05/2014
# Copyright:   (c) Vincent 2014
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def grad(clas, studentnum): #pass over function
    grades = []; #set grades to equal array
    while (clas >= studentnum): #loop while user input greater than studentnum
        print("Student number",studentnum); #write statement
        grade = float(input("enter grade for student: \n")); #set variable grade to get user input
        grades.append(grade); #add user input to end of list
        studentnum += 1; #variable equal it's self plus one
        print (grades)
    add(grades); #pass over list grades

def add(grades): #pass over function
    sum = 0; #set variable sum to equal zero
    for i in grades: #count conroll loop
        sum += i; #new sum equals old sum plus grade in list
    average = sum/len(grades); #set average to equal sum divided by length of list
    print("The class average is", average); #write average

def main(): #defined main
    studentgrade = 1; #set variable studentgrade to equal one
    clas = float(input("Enter how many people you have in your class: ")); #set variable class to user input float integer
    grad(clas, studentgrade); #passover to function grad

if (__name__ == '__main__'):
    main();
