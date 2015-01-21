n=int(raw_input(""))
s=raw_input("")
l=s.split(" ")
for i in range(n):
	l[i]=int(l[i])
l.sort()
sum=0;
for i in range(n-1):
	sum+=(i+2)*l[i]
sum+=(n*l[n-1])
print sum