s=map(int,raw_input("").split(" "))
n=s[0]
m=s[1]
v=[]
for i in range(n):
	v.append(i+1)
for i in range(m):
	t=map(int,raw_input("").split(" "))
	if t[0] in v:
		v.remove(t[0])
	if t[1] in v:
		v.remove(t[1])
print n-1
for i in range(1,n+1):
	if i!=v[0]:
		print i,v[0]