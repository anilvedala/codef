n=int(raw_input(""))
s=(raw_input("").split(" "))
l1=[]
l2=[]
l3=[]
for i in range(len(s)):
	s[i]=int(s[i])
	if s[i]==1:
		l1.append(i+1)
	elif s[i]==2:
		l2.append(i+1)
	else:
		l3.append(i+1)
s1=[len(l1),len(l2),len(l3)]
mini=min(s1)
if mini==0:
	print "0"
else:
	print mini
	k=0
	for i in range(mini):
		print l1[k],l2[k],l3[k]
		k+=1
		
	
	       

