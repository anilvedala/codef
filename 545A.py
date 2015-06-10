n=int(raw_input(""))
l=[]
good=[]
count=0
for i in range(n):
	s=map(int,raw_input("").split(" "))
	l.append(s)
for i in range(n):
	flag=0
	for j in range(n):
		if l[i][j]==1 or l[i][j]==3:
			flag=1
			break
	if flag==0:
		count+=1
		good.append(i+1)
print count
for i in good:
	print i,