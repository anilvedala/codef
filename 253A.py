l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
if n>=m:
	print "BG"*m+"B"*(n-m)
else:
	print "GB"*n+"G"*(m-n)
