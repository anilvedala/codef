a=raw_input("")
b=raw_input("")
same=[]
p=[]
j=0
count=0
for i in range(len(a)):
	if a[i]!=b[i]:
		count+=1
		same.append(0)
	else:
		same.append(1)
if count%2==1:
	print "impossible"
else:
	for i in range(len(a)):
		if same[i]==1:
			p.append(str(1-int(a[i])))
		else:
			if j<count/2:
				p.append(a[i])
			else:
				p.append(b[i])
			j+=1
	print ''.join(p)
