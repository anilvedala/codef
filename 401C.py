import sys
l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
if n-1==m:
	print '01'*m,
	#print "0",
	sys.stdout.write("0")
elif n==m:
	print '01'*n
elif m>n and m<2*n:
	print "011"*(m-n)+"01"*(2*n-m)
elif m==2*n:
	print "011"*n
elif m==2*n+1:
	print "1"+'011'*n
	#print '011'*n
elif m==2*n+2:
	sys.stdout.write("11")
	print "011"*n
else:
	print "-1"

