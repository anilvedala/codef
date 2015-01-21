s=raw_input("")
s1=s.split(" ")
n=int(s1[0])
m=int(s1[1])
a=int(s1[2])
b=int(s1[3])
if float(b)/float(m) < float(a) :
	if b<(n%m)*a:
		print (n/m)*b+b
	else:
		print (n/m)*b+(n%m)*a
	
else:
	print n*a