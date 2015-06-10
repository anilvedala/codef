n=int(raw_input(""))
less_than=[]
greater_than=[]
for i in range(n):
	sign,x,answer=raw_input("").split(" ")
	if sign=='>':
		if answer=='Y':
			greater_than.append(int(x)+1)
		else:
			less_than.append(int(x))
	elif sign=='<':
		if answer=='N':
			greater_than.append(int(x))
		else:
			less_than.append(int(x)-1)
	elif sign=='<=':
		if answer=='N':
			greater_than.append(int(x)+1)
		else:
			less_than.append(int(x))
	else:
		if answer=='Y':
			greater_than.append(int(x))
		else:
			less_than.append(int(x)-1)
if len(greater_than)!=0 and len(less_than)!=0:
	mini=max(greater_than)
	maxi=min(less_than)
	if maxi-mini>=0:
		print maxi
	else:
		print "Impossible"
elif len(less_than)==0:
	print max(greater_than)
else:
	print min(less_than)