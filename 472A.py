n=int(raw_input(""))
l=[]
flag=0
high=[]

for i in range(n):
	l.append(map(int,raw_input("").split(" "))) 
for i in range(n):
	high.append(max(l[i]))
for i in range(0,n):
	for j in range(i,n):
		if j==i:
			if l[i][j]!=0:
				flag=1
				print "NO"
				break
			else:
				l[i][j]=high[i]+1
		if l[j][i]!=l[i][j] or (i!=j and l[i][j]==0):
			flag=1
			print "NO"
			break
	if flag==1:
		break

if flag==0:
	rem=[]
	for i in range(n):
		rem.append(i)
	k=0
	le=len(rem)
	p=0
	rem.remove(0)
	while le>0:
		m=min(l[k])
		ind=l[k].index(m)
		if ind in rem: 
			rem.remove(ind)
		l[k][ind]=l[ind][k]=high[k]+1
		high[k]+=1
		le-=1
		if k!=0:
			#print "yay"
			if l[k][ind]==l[k][p]+l[p][ind] or l[k][ind]==max([l[p][ind],l[k][p]])-min([l[p][ind],l[k][p]]):
				flag=1
				print "NO"
				break   
		#l[k][ind]=l[ind][k]=100000000      
		p=k
		k=ind
if flag==0:
	print "YES"