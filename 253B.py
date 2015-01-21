
with open('input.txt') as f:
	n=int(raw_input(""))
	l=map(float,raw_input("").split(" "))
l=sorted(l)
count=0
with open('output.txt','w') as f:
	while 1>0:
		if len(l)>=1 and l[len(l)-1]/l[0]<=2:
			break
		else:
			if l[len(l)-2]/l[0]<=2:
				count+=1
				break
			elif l[len(l)-1]/l[1]<=2:
				count+=1
				break
			else:
				l.remove(l[0])
				count+=1
	print count

