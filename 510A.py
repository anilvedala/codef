l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
for i in range(1,n+1):
	if i%4==1 or i%4==3:
		print "#"*m
	elif i%4==0:
		print "#"+"."*(m-1)
	else:
		print "."*(m-1)+"#"
