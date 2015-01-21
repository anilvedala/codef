s=map(int,raw_input("").split(" "))
n=s[0]
t=s[1]
l=map(int,raw_input("").split(" "))
path=[]
for i in range(n+1):
	path.append(0)
for i in range(1,n):
	path[i]=l[i-1]+i
flag=1
p=1
while flag==1:
	if path[p]==t:
		flag=0
	else:
		p=path[p]
		if p==0:
			break
if flag==0:
	print "YES"
else:
	print "NO"




