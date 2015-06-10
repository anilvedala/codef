s=map(int,raw_input("").split(" "))
n=s[0]
m=s[1]
d=min([n,m])+1
print d
i=0
while d>0:
	print n,i
	n-=1
	i+=1
	d-=1
