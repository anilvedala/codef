s=raw_input("")
k=int(raw_input(""))
l=[0]
for i in range(1,len(s)):
	if s[i]==s[i-1]:
		l.append((l[i-1]+1))
	else:
		l.append(l[i-1])
r=[]
for i in range(k):
	q=map(int,raw_input("").split(" "))
	r.append((l[q[1]-1]-l[q[0]-1]))
for i in r:
	print i
