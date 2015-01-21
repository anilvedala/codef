n=int(raw_input(""))
l=[]
for i in range(n):
	l.append(int(raw_input("")))
superior=[[]]
for i in range(n):
	superior.append([])
for i in range(n):
	p=l[i]
	while p!=-1:
		superior[i+1].append(p)
		superior[i+1].extend(superior[p])
		p=l[p-1]
groups=[]
for i in range(1,n+1):
	if len(superior[i])==0:
		if len(groups)==0:
			groups.append([i])
		else:
			if i not in l:
				groups[0].append(i)
			else:
				galf=0
                for k in range(len(groups)):
					if i not in (superior[x] for x in groups[k]):
						groups[k].append(i)
						galf=1
						break
				if galf==0:
					groups.append([i])									
	else:
		flag=0
		for k in range(len(groups)):
			
			x=set(groups[k])
			y=set(superior[i])
			if len(list(x.intersection(y)))==0:
				groups[k].append(i)
				flag=1
				break			
		if flag==0:
			groups.append([i])
print len(groups)
print superior
print groups









