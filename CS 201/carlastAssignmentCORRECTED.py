
import random
from operator import attrgetter


#Drivers in their sponsors
drivers={'Vince': 'Vis-Tech',
         'Gibby': 'Icarly',
         'Hope': 'Darkness',
         'Fear': 'Light',
         'Anger': 'Target',
         'Kennedy': 'White House',
         'Kennedy Jr.': 'Human',
         'Joshua': 'Nikey',
         'Josh': 'Rebook',
         'Kate': 'State Farm',
         'Dexter': 'Diddy',
         'Jeffery': 'Bed, Bath, and Beyond',
         'Jasmen': 'Marines',
         'Boxer': 'Army',
         'Mikey': 'Navy',
         'Diggle': 'Team Arrow',
         'Kay': 'Mars',
         'Matthew': 'Sams',
         'Bill': 'Red-bull',
         'Chris': 'Newegg'
}


class car:
    #constructor
    def __init__(self, Driver, Sponsor, Odometer=0, Speed=0):
        self.Odometer = Odometer
        self.Speed =  Speed
        self.Driver = Driver
        self.Sponsor = Sponsor


#put items in dictionary in list
cars = [car(driver, sponsor) for driver, sponsor in drivers.items()]

#let code run completely it scrolls trough progress
car_max = max(cars, key=attrgetter("Odometer"))
time = 0
loop = 5
#loop ends oce hits 500
while (car_max.Odometer < 500):
        time += 1
        if (time >= loop):
                 loop += 5
                 for car in cars:
                        car.Odometer += car.Speed*(1/60)
                        car.Speed = random.randint(60,120)
                        print(car.Driver,"is at", car.Odometer,"with a speed of", car.Speed)
                 if (car_max.Odometer > 500):
                    print ("And the winner is", car_max.Driver,"sponsored by", car_max.Sponsor)

