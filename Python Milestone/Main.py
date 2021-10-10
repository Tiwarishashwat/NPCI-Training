import datetime
import time
import json

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
    time.sleep(0.5)
    print("Hi,",CustomerName,".I hope you are doing well")
    return CustomerName

def getStatus(ticketNumber,CustomerName):
    with open("CustomerTicketStatus.json") as f:
        data = json.loads(f.read())
        for i in data['ticket_details']:
            if i['ticketNumber']==ticketNumber:
                if i['CustomerName'] == CustomerName:
                    return i['status']
                else:
                    print("You have entered a wrong ticket number. Please check again")
                    return ""
    time.sleep(0.5)
    return  ticketNumber + " is not found! \n Please check again"

def getNumber():
    with open("CustomerTicketStatus.json","r") as f:
        data = json.loads(f.read())
        ticketNumber = ""
        getLen=0
        for i in data['ticket_details']:
            ticketNumber = i['ticketNumber']
        if ticketNumber == "":
            ticketNumber = "00001"
            getLen = len(ticketNumber)
        else:
            ticketNumber = int(ticketNumber) + 1
            ticketNumber = str(ticketNumber)
            if len(ticketNumber) < getLen:
                ticketNumber = (getLen - len(ticketNumber))*"0" + ticketNumber
        f.seek(0)
    return ticketNumber

def convertToJson(CustomerName, message, ticketNumber, status):
    entry={}
    entry["CustomerName"] = CustomerName
    entry["message"] = message
    entry["ticketNumber"] = ticketNumber
    entry["status"] = status
    return entry

def raiseConcern(CustomerName):
    time.sleep(0.5)
    print("Enter your concern")
    message = input()
    ticketNumber = getNumber()
    new_entry = convertToJson(CustomerName, message, ticketNumber, "Pending")
    with open("CustomerTicketStatus.json",'r+') as f:
        data = json.loads(f.read())
        data["ticket_details"].append(new_entry)
        f.seek(0)
        json.dump(data,f,indent = 4)
    time.sleep(0.5)
    return "Your Ticket has been successfully raised. Please Note down your Ticket Number "+ticketNumber+" for future references"

def checkConcern(CustomerName):
    time.sleep(1)
    print("Do you have a ticket or are you here to raise a concern?")
    time.sleep(0.5)
    print("Press 1 for first option")
    time.sleep(0.5)
    print("Press 2 for second option")
    choice = input()
    if choice!="1" and choice!="2":
        time.sleep(0.5)
        print("Not a correct choice")
    if choice == "1":
        time.sleep(0.5)
        print("Enter your ticket number")
        ticketNumber = input()
        status = getStatus(ticketNumber,CustomerName)
        time.sleep(0.5)
        if status == "Pending":
            print("we are working on your concern. Kindly check back later")
        elif status == "Resolved":
            print("Congratulations, Your ticket status is Resolved")
    else:
        print(raiseConcern(CustomerName))

def welcome():
    print("Welcome to ShashZone Online Shopping ChatBox Application")
    time.sleep(2)
    print(greetAccordingToTime())
    time.sleep(1)
    CustomerName = greetAccordingToName()
    checkConcern(CustomerName)
    # time.sleep(2)

welcome()
