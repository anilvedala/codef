l=map(int,raw_input("").split(" "))
n=l[0]
t=l[1]
c=l[2]
s=map(int,raw_input("").split(" "))
contiguous=[]
last=0
for i in range(n):
	if s[i]>t:
		if last==0:
			contiguous.append(i)
		else:
			contiguous.append(i-last-1)
		last=i
if len(contiguous)!=0:
	contiguous.append(n-last-1)
else:
	contiguous.append(n-last)

ways=0
for i in contiguous:
	if i-c+1>0:
		ways+=(i-c+1)
print ways
