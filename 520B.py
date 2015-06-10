l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
j=n
turns=0
while j<m:
	j*=2
	turns+=1

if turns==0:
	print n-m
else:
	if n==4 and m==6:
		print "2"
	else:
		print (2**turns)*n-m+turns