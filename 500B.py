n=int(raw_input(""))
l=map(int,raw_input("").split(" "))
A=[]
for i in range(n):
	A.append(raw_input(""))
for i in range(n):
	if l[i]!=(i+1):
		p=l.index(i+1)
		if A[i][p]=='1':
			r=l[i]
			l[i]=i+1
			l[p]=r
		print " ".join(str(x) for x in l)
print " ".join(str(x) for x in l)

