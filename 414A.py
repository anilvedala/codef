l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
if (n==1 and k!=0) or (n>3 and k==1):
	print "-1"
elif k==0 and n==1:
	print "1"
elif k>=n/2:
	j=1
	for i in range(1,n/2):
		print j,j+1,
		j+=2
	if (k-n/2+1)>j-1:
		print (k-n/2+1),(k-n/2+1)*2
		if n%2==1:
			print (k-n/2+2)
	else:
		print (k-n/2+1)*j,(k-n/2+1)*(j+1),
		if n%2==1:
			print (k-n/2+1)*(j+2)

else:
	print "-1"