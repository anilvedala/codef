n=int(raw_input(""))
a=[]
b=[]
queue=[0]*n
for i in range(n):
	s=(raw_input("")).split(" ")
	a.append(int(s[0]))
	b.append(int(s[1]))
x=0
c=0
ind=-1
while 1>0:
	if x in a:
		t=a.index(x)
		x=b[t]
		ind+=2
		if ind>=n:
			break
		queue[ind]=b[t]		
		c+=1
	else:
		break
if n%2==0:
	ind=n
	x=0
	while 1>0:
		if x in b:
			t=b.index(x)
			x=a[t]
			queue[ind-2]=a[t]
			ind-=2
			c+=1		
			if c==n:
				break
else:
	for i in a:
		if i!=0 and i not in b:
			queue[0]=i
			ind=0
			c+=1
			x=i
	while 1>0:
		if x in a:
			t=a.index(x)
			x=b[t]
			ind+=2
			queue[ind]=b[t]
			c+=1
			if c>=n:
				break

for i in range(n):
	print queue[i],