n=raw_input("")
count=0
while 1>0:
	count+=1
	t=int(n)
	t+=1
	n=str(t)
	flag=0
	for i in n:
		if i=='8':
			print count
			flag=1
			break
	if flag==1:
		break
	






