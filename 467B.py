
from operator import xor
s=raw_input("")
l=s.split(" ")
n=int(l[0])
m=int(l[1])
k=int(l[2])
a=[]
c=0
for i in range(m+1):
	a.append(int(raw_input("") ))
for i1 in range(m):
	c1=0

	q=str(bin(xor(int(a[i1]),int(a[m]))))
	for i2 in range(len(q)):
		if q[i2]=='1':
			c1+=1
	if c1<=k:
		c+=1
print c

	
 

	
	
