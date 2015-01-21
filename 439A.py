l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
s=map(int,raw_input("").split(" "))
su=sum(s)
if su+(n-1)*10 > k:
	print "-1"
else:
	left=k-su-(n-1)*10
	print 2*(n-1)+left/5