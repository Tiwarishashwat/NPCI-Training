
print("1. To add new element to the list ")
print("2. to create dictionary from a list")
print("sort dictionary in descending order based on value")
ch=int(input("Enter your choice"))

l=list(map(lambda x: int(x),(input("enter elements of list").split(","))))

if ch==1:
    new=int(input("enter element to be added"))
    l.append(new)
    print(l)
elif ch==2:
    dic={i:i for i in l}
    print(dic)
elif ch==3:
    rl=sorted(l,reverse=True)
    dic={i:i for i in rl}
    print(dic)