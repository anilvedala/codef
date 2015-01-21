s=raw_input("")
s1=s.split(" ")
n=int(s1[0])
a=int(s1[1])
b=int(s1[2])
c=int(s1[3])
l=[]
for i in range(n+1):
	l.append(0)
l[c]=1
l[b]=1
l[a]=1
l[n]=1
for i in range(1,n+1):
	if l[i]>=0:

	    max=1
	    if i>=a and l[i-a]>0:
		    if max < l[a]+l[i-a]:
		        max = l[a]+l[i-a]
	    if i>=b and l[i-b]>0:
		    if max < l[b]+l[i-b]:
		       max = l[b]+l[i-b]
	    if i>=c and l[i-c]>0:
		    if max < l[c]+l[i-c]:
		        max = l[c]+l[i-c]
	    l[i]=max
	    print l[i]
print l[n]
