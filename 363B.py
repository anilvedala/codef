s=raw_input("")
s1=s.split(" ")
n=int(s1[0])
k=int(s1[1])
r=raw_input("")
l=r.split(" ")
t=[]
for i in range(n):
	t.append(0)
index=0

for i in range(len(l)):
	l[i]=int(l[i])
for j in range(k):
    t[0]=t[0]+l[j]
min = t[0]
for i in range(1,n-k+1):
	t[i]=t[i-1]-l[i-1]+l[i+k-1]
	if min > t[i]:
		min=t[i]
		index=i
print index+1