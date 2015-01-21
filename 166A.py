l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
time_stamps=[[]]
for i in range(50):
	time_stamps.append([])
for i in range(n):
	e=map(int,raw_input("").split(" "))
	time_stamps[e[0]].append(e[1])
kth=0
previous_kth=0
number_of_people=0
for i in range(50):
	if len(time_stamps[50-i])!=0:
		previous_kth=kth
		kth=len(time_stamps[50-i])+kth
		if kth>=k:
			number_of_people=50-i
			break
final=sorted(time_stamps[number_of_people])
c=final[k-previous_kth-1]
count=0
for i in final:
	if i==c:
		count+=1
print count