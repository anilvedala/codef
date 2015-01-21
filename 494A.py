s=raw_input("")
c=0
ash=0
flag=0
a=[]
for i in s:
	if i=='(':
		c+=1
	if i==')':
	    c-=1
	if c=='#':
		a.append(c)
		ash+=1
b=[]
if c<ash:
	print "-1"
else:
	for i in range(len(a)):
		a[i]=a[i]-1
		b.append(1)
	c=c-ash
	while c>=0:
		









