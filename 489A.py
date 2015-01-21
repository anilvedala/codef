n=int(raw_input(""))
l=[]

l=(raw_input("").split(" "))
for i in range(len(l)):
	l[i]=int(l[i])
	
s=l
s=sorted(s)

final=[[]]
for i in range(len(s)):
	
	if l[i]==s[i]:
		pr
		pass
	else:
		t=l[i]
		p=[]
		p.append(l.index(l[i]))
		p.append(l.index(s[i]))
		l[i]=s[i]
		print l[i]
		l[l.index(s[i])]=t
		final.append(p)
		print l
		
		
final.remove([])
print len(final)
for i in range(len(final)):
	print final[i][0],final[i][1]

