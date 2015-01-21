n=int(raw_input(""))
s=raw_input("")
s1=s.split(" ")
l=[]
c=0
for i in range(n):
	l.append(int(s1[i]))
for i in range(n):
	if l[i]==1:
		if c==0:
			c=1

		
		prev=i
		i+=1
		if i<n:
			while i<n and l[i]==0:
				i+=1
			if i<n:
				if i-prev>=2:
					c=c+2
					i=i-1
				elif i-prev==1:
					c=c+1
					i=i-1

if c>1:
	print c
else:
	print c


