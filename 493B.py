n=int(raw_input(""))
p1=""
p2=""
pc=0
pn=0
t=""
flag=0
for  i in range(n):
	t=raw_input("")
	s=int(t)
	if s>0:
		pc=pc+s
		p1=p1+str(s)
	else:
		s=0-s
		pn=pn+s
		p2=p2+str(s)
if pc>pn:
	print "first"
elif pc<pn:
	print "second"
else:
	mini=min([len(pc),len(pn)])
	for i in range(mini):
		if int(pc[i])==int(pn[i]):
			pass
		elif int(pc[i])<int(pn[i]):
			flag=1
			break
		else:
			flag=2
			break




