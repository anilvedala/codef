n=int(raw_input(""))

n1=raw_input("")
n2=n1.split(" ")
if n!=1:

    l=[0]
    e=0
    max=0
    for i in range(n):
	    l.append(int(n2[i]))
	    if(max<l[i+1]):
		    max=l[i+1]
    e=e+max
    c=e
    for i in range(1,n+1):
	    e=e+l[i-1]-l[i]
	    if e<0:
		    e=0
		    c=c-e

     	
    print c
else :
	print int(n1)