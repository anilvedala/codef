def points(p,t):
	if (3*p)/10>(p-(p/250)*t):
		return (3*p)/10
	return (p-(p/250)*t)
l=map(int,raw_input("").split(" "))
if points(l[0],l[2])>points(l[1],l[3]):
	print "Misha"
elif points(l[0],l[2])<points(l[1],l[3]):
	print "Vasya"
else:
	print "Tie"