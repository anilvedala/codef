n=int(raw_input(""))
c=0
for i in range(n):
	s=raw_input("")
	l=s.split(" ")
	if (int(l[1])-int(l[0]))>=2:
		c+=1
print c