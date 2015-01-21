n1=raw_input("")
n2=n1.split(" ")
n=int(n2[0])
m=int(n2[1])
l=[]
s=raw_input("")
l=s.split(" ")
j=0
for i in range(n):
	l[i]=int(l[i])
c=n
while c!=0:
	for i in range(n):
		if l[i]>0:
			j=i+1
			if l[i]>m:
				l[i]=l[i]-m
			else:
				l[i]=0
				c=c-1
print j
