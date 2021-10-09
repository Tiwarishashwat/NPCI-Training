import datetime
import time
def greetAccordingToTime():
    currentTime = datetime.datetime.now()
    if currentTime.hour < 12:
        return "Good Morning"
    elif currentTime.hour>=12 and currentTime.hour < 18:
        return "Good Afternoon"
    else:
        return "Good Evening"

def greetAccordingToName():
    print("May I Know your Name Please?")
    CustomerName = input()
    print("Hi, ",CustomerName,".I hope you are doing well")

def welcome():
    print("Welcome to ShashZone Online Shopping ChatBox Application")
    time.sleep(3)
    print(greetAccordingToTime())
    time.sleep(2)
    print(greetAccordingToName())
    # time.sleep(2)

welcome()
