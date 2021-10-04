from os import system, name
# import sleep to show output for some time period
from time import sleep
# define our clear function
def clear():

    # for windows
    if name == 'nt':
        _ = system('cls')

    # for mac and linux(here, os.name is 'posix')
    else:
        _ = system('clear')
class ATM():
    def __init__(self, currency, limit, timesWithdraw):
        self.currency = currency
        self.limit = limit
        self.timesWithdraw = timesWithdraw

    def calMaxWithdrawAmount(self):
        sum=0
        for key in self.currency:
            sum+=key*self.currency[key]
        return sum

currency = {100: 10, 200: 15, 500: 30}

class Account:
    def __init__(self, accountId, transactionType):
        self.accountId = accountId
        self.transactionType = transactionType
        self.balance = 50000

    def debit(self,Oamount,maxAmount,obj):
        if Oamount > self.balance:
            return "Insufficient Balance Amount"
        elif Oamount > maxAmount:
            return "Transaction amount unavailable. Please enter smaller amount"
        else:
            amount = Oamount
            count500=0
            while amount>=500 and count500 < obj.currency[500]:
                count500+=1;
                amount=amount-500

            count200=0
            while amount>=200 and count200 < obj.currency[200]:
                count200+=1
                amount=amount-200

            count100=0
            while amount>=100 and count100 < obj.currency[100]:
                count100+=1
                amount=amount-100

            wdAmount = count100*100 + count200*200 + count500*500

            if Oamount > wdAmount:
                print("This amount cannot be Dispensed. Do you want to Withdraw ",count100*100+count200*200+count500*500, "Yes/No")
                choice=input()
                if choice == "Yes":
                    obj.currency[500]-=count500
                    obj.currency[200]-=count200
                    obj.currency[100]-=count100
                    self.balance-=Oamount
                    return "Debit Transaction Successful!"
                elif choice == "No":
                    return "Dispense currency not accurate, Please enter multiples of 500, 200 or 100"
            else:
                obj.currency[500]-=count500
                obj.currency[200]-=count200
                obj.currency[100]-=count100
                self.balance-=Oamount
                return "Debit Transaction Successful!"

    def credit(self, den_100,den_200,den_500,obj):
        bal = den_100*100 + den_200*200 + den_500*500
        self.balance+=bal
        obj.currency[500]+=den_500
        obj.currency[200]+=den_200
        obj.currency[100]+=den_100
        return "Credit Successful!"

atm = ATM(currency,5000,2)
while True:
    print("\t --------------- \t Hi Welcome to xyz ATM \t --------------- ")

    print("Enter your bank account")
    accNo = input()

    print("Enter your bank pincode")
    pinCode = input()
    if pinCode!="2222":
        print("Wrong pin code, this action will be reported!")
        break

    print(".....Press 1 for credit")
    print(".....Press 2 for debit")
    print(".....Press 3 for exit")
    choice = input()

    if choice == "1":
        account = Account(accNo,"credit")
        print("Enter Denomination of 100")
        den100 = int(input())
        print("Enter Denomination of 200")
        den200 = int(input())
        print("Enter Denomination of 500")
        den500 = int(input())
        print(account.credit(den100,den200,den500,atm))
        sleep(3)
        clear()


    elif choice== "2":
        account = Account(accNo,"debit")
        print("Available Currency is: ",atm.currency)
        print(account.debit(520,0.9*atm.calMaxWithdrawAmount(),atm))
        sleep(3)
        clear()
    else:
        print("Thankyou for using xyz ATM")
        break
