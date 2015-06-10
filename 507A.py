l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
s=map(int,raw_input("").split(" "))
s1=sorted(s)
val=[]
flag=0
for i in range(n):
	if s1[i]<=k:
		u=s.index(s1[i])
		val.append(u+1)
		s[u]=0
		k-=s1[i]
	else:
		break
print len(val)
for i in val:
	print i,


