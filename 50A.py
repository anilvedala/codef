l=[ "Sheldon", "Leonard", "Penny", "Rajesh", "Howard"]
n=int(raw_input(""))
if n<=5:
	print l[n-1]
else:
	a=5
	r=2
	su=a
	term=1
	while su<n:
		a=a*r
		su+=(a)
		term+=1
	if su==n:
		print "Howard"
	else:
		dif=su-a
		dif=n-dif
		term=2**(term-1)
		if dif%term!=0:

			print l[dif/term]
		else:
			print l[dif/term-1]
