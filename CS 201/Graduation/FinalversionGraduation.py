'''
Graduation

Created on Sep 12, 2014

@author: Vincent
'''
import sys
#Import system specific parameters and functions

math  = float(input("How many Credits do you have for math: "));
science = float(input("How many Credits do you have for Science: "));
English = float(input("How many Credits do you have for English: "));
SocialStudies = float(input("How many Credits do you have for Social Studies: "));
GPA = float(input("What Was Your Gpa on a 4 point scale: "));
totalcredits = math + science + English + SocialStudies;
#math, science, enlgish, and social studies quals take input of credits from the user
#GPA equals take gpa average from user
#total credits equal to math and science and english and social studies

GPA >= 2.0;
English >= 8;
math + science >= 6;
SocialStudies >= 4;
specialrequire = English or math + science or SocialStudies;
#set GPA greater than or equal to 2.0
#set English greater than or equal to 8
#set math and science greater than or equal to 6
#set social studies greater than or equal 4
#set special requirements to equal english or math and science or social studies

print ("You have a total of", totalcredits, "credits");
#Write total credits

if totalcredits <= 39.9:
    if GPA <= 2.0:
        if English <= 8:
            if math + science <= 6:
                if SocialStudies <= 4:
                    print ("You're not ready to Graduate");
#if total credits and GPA and English and math + science and social studies is less than or equal to requirements
#Write you're not ready to Graduate

if GPA <= 2.0:
    print ("You are on academic probation");
    
#if GPA less than or equal to 2.0, write "you are on academic probation"
if totalcredits >= 40:
    if GPA >= 2.0:
        if English >= 8:
            if math + science >= 6:
                if SocialStudies >= 4:
                    print ("You Graduate!!!");
                    sys.exit();
#if total credits and GPA and English and math + science and social studies meets requirements, Write you Graduate
#if condition's meet exit 

if totalcredits >= 40:
    if GPA >= 2.0:
        if specialrequire == specialrequire:
            print ("Take one more year of General Education");
            sys.exit();
        
#if total credits and GPA and one special requirement meets requirements, write take one more year of general ed
#if conditions meet exit
        
if totalcredits <= 39.9:
    print ("Take more major credits.");
    #if total credits meet requirements, Write take more major credits
    if GPA <= 2.0:
        print ("Work on getting GPA up.");
        #if total credits and GPA meets requirements, Write work on getting GPA up
        if specialrequire == specialrequire:
            if specialrequire == specialrequire:
                print ("You need to take at least one more semester");
                sys.exit();
                #if total credits and Gpa and specialrequire and specialrequire meets requirements
                #Write you need to take at least one more semester
                #if conditions meet exit


