l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
if n%2==1:
	if k<=n/2+1:
		print k*2-1
	else:
		print ((k-n/2-1)*2)
else:
	if k<=n/2:
		print k*2-1
	else:
		print ((k-n/2)*2)

