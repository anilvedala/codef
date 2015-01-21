s=raw_input("")
l=s.split(" ")
for i in range(len(l)):
	l[i]=int(l[i])
if sum(l)%len(l)==0:
	if max(l)==0:
		print "-1"
	else:
		print sum(l)/len(l)
else:
	print "-1"

