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

    def debit(self,amount,maxAmount,obj):
        if amount > self.balance:
            return "Insufficient Balance Amount"
        elif amount > maxAmount:
            return "Transaction amount unavailable. Please enter smaller amount"
        else:
            count500=0
            while amount>=500 and count500 < obj.currency[500]:
                count500+=1;
                amount=amount-500
            print("count of 500", count500)
            count200=0
            while amount>=200 and count200 < obj.currency[200]:
                count200+=1
                amount=amount-200
            print("count of 200", count200)
            count100=0
            while amount>=100 and count100 < obj.currency[100]:
                count100+=1
                amount=amount-100
            print("count of 100", count100)
            if amount > count100*100 + count200*200 + count500*500:
                return "Dispense currency not accurate, Please enter multiples of 500, 200 or 100"
            else:
                obj.currency[500]-=count500
                obj.currency[200]-=count200
                obj.currency[100]-=count100
                return "Debit Transaction Successful!"

    def credit(self, den_100,den_200,den_500,obj):
        bal = den_100*100 + den_200*200 + den_500*500
        self.balance+=bal
        obj.currency[500]+=den_500
        obj.currency[200]+=den_200
        obj.currency[100]+=den_100
        return "Credit Successful!"

atm = ATM(currency,5000,2)
print(atm.currency)
account = Account(10501,"debit")
print(account.debit(15500,0.9*atm.calMaxWithdrawAmount(),atm))
print(atm.currency)
print(account.credit(10,10,10,atm))
print(atm.currency)
