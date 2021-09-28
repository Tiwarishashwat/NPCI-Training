#Assignment 1
t=(1,2,5,(5,8,7,(8,7,1,(5,1))))
t1=t
print("tuple is:",t)
c=0
l=[]
l1=[]
while t:
    for i in t:
        if isinstance(i,tuple):
            print(t)
            l.append(l1)
            l1=[]
            t=i
            del i
            c=c+1
            print(c)
        else:
            l1.append(i)

    if len(t)==2:
        l.append(l1)
        print(t)
        c=c+1
        print(c)
        break

print("no of levels: ",c)
level =c
print(l)
s=" "
for i in t1:
    for j in l:
        if i in j:
            print(s*(l.index(j)+1)+str(i))
        else:
            print(s*(l.index(j)+1)+"_")
