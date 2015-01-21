n=int(raw_input(""))
l=map(int,raw_input("").split(" "))
p=[]
n=[]
zero=[]
for i in l:
	if i==0:
		zero.append(0)
	elif i>0:
		p.append(i)
	else:
		n.append(i)
q=0
if len(n)%2==0:
	q=n[0]
	n.remove(n[0])
	zero.append(q)
if len(p)==0:
	q=n[0]
	n.remove(n[0])
	p.append(q)
	q=n[0]
	n.remove(n[0])
	p.append(q)
print len(n),
for i in n:
	print i,
print ""
print len(p),
for i in p:
	print i,
print ""
print len(zero),
for i in zero:
	print i,



