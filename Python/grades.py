nStudents = int(input())
students = list()
passed = list()
distinction = list() 
firstDiv = list()
secondDiv = list()
reAppear = list()
failed = list()

for i in range(nStudents) :
    roll_no = i + 1
    marks_list = list(map(int, input("Enter the marks for Physics, Chemistry and Mathematics : ").split()))
    count = 0 
    for marks in marks_list :
        if marks < 50 : 
            count += 1
    if count > 1 :
        failed.append(roll_no)
    elif count == 1 :
        reAppear.append(roll_no)
    else : 
        passed.append(roll_no)
        avg_marks = sum(marks_list)/3
        if ( avg_marks >= 80) :
            distinction.append(roll_no)
        elif (avg_marks >= 60) :
            firstDiv.append(roll_no)
        else : 
            secondDiv.append(roll_no)

print("Class Performance Details : ")
print("Students who have failed : ")
for stud in failed :
    print(stud, end="\t")
print("Students who will reappear : ")
for stud in reAppear : 
    print(stud, end="\t")
print()
print("Percentage of Students failed : ", (len(failed)/nStudents) * 100)
print("Percentage of Students reappearing : ", (len(reAppear)/nStudents) * 100)
print("Percentage of Students passed : ", (len(passed)/nStudents) * 100)
print("Percentage of Students in Distinction : ", (len(distinction)/nStudents) * 100)
print("Percentage of Students in First Division : ", (len(firstDiv)/nStudents) * 100)
print("Percentage of Students in Second Division : ", (len(secondDiv)/nStudents) * 100)