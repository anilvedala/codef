l=map(int ,(raw_input("").split(" ")))
num=[0,0,0,0,0,0,0,0,0]
for i in l:
	num[i-1]+=1
count=0
flag=0
for i in num:
	if i>0:
		count+=1
if count==3:
	for i in num:
		if i==4:
			print "Bear"
			flag=1
			break
elif count==2:
	for i in num:
		if i==4:
			print "Elephant"
			flag=1
			break
		elif i==5:
			print "Bear"
			flag=1
			break
elif count==1:
	print "Elephant"
	flag=1
if flag==0 or (count!=1 and count!=2 and count!=3):
	print "Alien"
	
