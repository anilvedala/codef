l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
if m-n>=2:
	if n%2==0:
		print n,n+1,n+2
	else:
		if m-n==2:
			print "-1"
		else:
			print n+1,n+2,n+3
else:
	print "-1"