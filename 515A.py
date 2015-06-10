l=map(int,raw_input("").split(" "))
a=l[0]
if a<0:
	a=-a
b=l[1]
if b<0:
	b=-b
s=l[2]
if s>=(a+b) and (s-a-b)%2==0:
	print "Yes"
else:
	print "No"