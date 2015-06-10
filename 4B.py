l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
low_limit=[]
high_limit=[]
for i in range(n):
	l1=map(int,raw_input("").split(" "))
	low_limit.append(l1[0])
	high_limit.append(l1[1])
if k<sum(low_limit) or k>sum(high_limit):
	print "NO"
else:
	k-=sum(low_limit)
	i=0
	while k>0:
		if k>(high_limit[i]-low_limit[i]):
			k-=(high_limit[i]-low_limit[i])
			low_limit[i]=high_limit[i]
		else:
			low_limit[i]+=k
			k=0
		i+=1
	print "YES"
	for i in range(n):
		print low_limit[i],


