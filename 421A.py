l=map(int,raw_input("").split(" "))
n=l[0]
a=l[1]
b=l[2]
first=map(int,raw_input("").split(" "))
second=map(int,raw_input("").split(" "))
liked_by=[[]]
for i in range(n):
	liked_by.append([])
for i in first:
	liked_by[i].append(1)
for i in second:
	liked_by[i].append(2)
for i in range(1,n+1):
	print liked_by[i][0],
