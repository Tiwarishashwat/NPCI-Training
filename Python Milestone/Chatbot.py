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
    print("Your Good Name Please?")
    CustomerName = input()
    time.sleep(0.5)
    print("Hi,",CustomerName,".I hope you are safe and sound")
    return CustomerName

def getStatus(ticketNumber,CustomerName):
    with open("CustomerTicketStatus.json") as f:
        data = json.loads(f.read())
        for i in data['ticket_details']:
            if i['ticketNumber']==ticketNumber:
                if i['CustomerName'] == CustomerName:
                    return i['status']
                else:
                    print("Ticket Number is not registered on your name. Please check again")
                    return ""
        time.sleep(0.5)
    return  "Entered ticket number "+ ticketNumber + " is not found!"

def getTicketNumber():
    with open("CustomerTicketStatus.json","r") as f:
        data = json.loads(f.read())
        ticketNumber = ""
        getLen=0
        for i in data['ticket_details']:
            ticketNumber = i['ticketNumber']
        if ticketNumber == "":
            ticketNumber = "00001"
        else:
            getLen = len(ticketNumber)
            ticketNumber = int(ticketNumber) + 1
            ticketNumber = str(ticketNumber)
            if len(ticketNumber) < getLen:
                ticketNumber = (getLen - len(ticketNumber))*"0" + ticketNumber
        f.seek(0)
    return ticketNumber

def convertToJson(CustomerName, message, ticketNumber, status, product, issueHead):
    entry={}
    entry["CustomerName"] = CustomerName
    entry["ticketNumber"] = ticketNumber
    entry["product"] = product
    entry["issueHead"] = issueHead
    entry["message"] = message
    entry["status"] = status
    return entry

def raiseConcern(CustomerName):
    time.sleep(0.5)
    print("Please enter the name of your product")
    productName = input()
    print("Please choose one of the following issues")
    print("Press 1 for Delayed Shipping")
    print("Press 2 for Damaged Product Delivered")
    print("Press 3 for Return/Replacement")
    print("Press 4 for Others")
    choice = input()
    issueHead=""
    if choice=="1":
        issueHead = "Delayed Shipping"
    elif choice=="2":
        issueHead = "Damaged Product Delivered"
    elif choice=="3":
        issueHead = "Return/Replacement"
    else:
        issueHead = "Others"
    print("Please provide a brief detail of your content")
    message = input()
    ticketNumber = getTicketNumber()
    time.sleep(0.5)
    new_entry = convertToJson(CustomerName, message, ticketNumber, "Pending",productName,issueHead)
    with open("CustomerTicketStatus.json",'r+') as f:
        data = json.loads(f.read())
        data["ticket_details"].append(new_entry)
        f.seek(0)
        json.dump(data,f,indent = 4)
    time.sleep(0.5)
    return "Your Ticket has been successfully raised. Please note your Ticket Number "+ticketNumber+" for future references!"

def checkConcern(CustomerName):
    time.sleep(1)
    print("Press 1 if you already have a ticket")
    time.sleep(0.5)
    print("Press 2 for raising a new ticket")
    choice = input()
    if choice!="1" and choice!="2":
        time.sleep(0.5)
        print("You have entered a wrong choice")
    if choice == "1":
        time.sleep(0.5)
        print("Kinly enter your ticket number")
        ticketNumber = input()
        status = getStatus(ticketNumber,CustomerName)
        if status == "Pending":
            time.sleep(0.5)
            print("we are working on your concern. Kindly check back with us later!")
        elif status == "Resolved":
            print("Congratulations "+CustomerName +", Your ticket status is Resolved!")
        else:
            print(status)
    else:
        print(raiseConcern(CustomerName))

def welcome():
    print("Welcome to Online Shopping ChatBox Application")
    time.sleep(2)
    print(greetAccordingToTime())
    time.sleep(1)
    CustomerName = greetAccordingToName()
    checkConcern(CustomerName)
    # time.sleep(2)

welcome()
time.sleep(0.5)
print("Thankyou for your precious time. See ya!")
