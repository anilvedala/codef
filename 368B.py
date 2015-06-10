l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
s=map(int,raw_input("").split(" "))
c=[]
count=0
for i in range(100001):
	c.append(0)
for i in s:
	if c[i]==0:
		count+=1
	c[i]+=1
ans=[0]
val=[]
for i in s:
	ans.append(count)
	c[i]-=1
	if c[i]==0:
		count-=1
for i in range(m):
	val.append(ans[int(raw_input(""))])
for i in val:
	print i



