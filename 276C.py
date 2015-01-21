l=map(int,raw_input("").split(" "))
n=l[0]
q=l[1]
s=map(int,raw_input("").split(" "))
count=[]
for i in range(n):
	count.append(0)
s=sorted(s)
for i in range(q):
	t=map(int,raw_input("").split(" "))
	count[(t[0]-1):t[1]]= [v+1 for v in count[(t[0]-1):t[1]]]
count=sorted(count)
s1=0
for i in range(n):
	s1=s1+count[n-1-i]*s[n-1-i]
print s1