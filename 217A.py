l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
c=[]
num=[0]

for i in range(n):
	c.append(0)
	num.append(0)
for i in range(m):
	l1=map(int,raw_input("").split(" "))
	c[l1[0]-1]+=1
	c[l1[1]-1]+=1
for i in c:
	num[i]+=1
if num[2]==n:
	print "ring topology"
elif num[2]==n-2 and num[1]==2:
	print "bus topology"
elif num[n-1]==1 and num[1]==n-1:
	print "star topology"
else:
	print "unknown topology"
