'''
Created on Sep 12, 2014

@author: Vincent
'''
math  = float(input("How many Credits do you have for math: "));
science = float(input("How many Credits do you have for Science: "));
English = float(input("How many Credits do you have for English: "));
SocialStudies = float(input("How many Credits do you have for Social Studies: "));
GPA = float(input("What Was Your Gpa on a 4 point scale: "));
totalcredits = math + science + English + SocialStudies;
print ("You have a total of", totalcredits, "credits");
if totalcredits >= 40:
    if GPA >= 2.0:
        if English >= 8:
            if math + science >= 6:
                if SocialStudies >= 4:
                    print ("You Graduate");
if English >= 8:
    if SocialStudies >= 4:
        print ("You need to take at least one more semester");
        print ("Work on Your GPA");
if GPA >= 2.0:
    if totalcredits >= 40:
        if English >= 8:
            print ("Please Take one more semester of General Education");
if GPA <= 2.0:
    print ("You are on academic probation");
else:
    print ("You're not ready to Graduate");
