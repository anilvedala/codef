n=int(raw_input(""))
l=[]
flag=0
for i in range(n):
    l.append(raw_input(""))
for i in range(n):
	for j in range(n):
		count=0
		if j-1>=0:
			if l[i][j-1]=='o':
				count+=1
		if j+1<n:
			if l[i][j+1]=='o':
				count+=1
		if i-1>=0:
			if l[i-1][j]=='o':
				count+=1
		if i+1<n:
			if l[i+1][j]=='o':
				count+=1
		if count%2!=0:
			flag=1
			break
	if flag==1:
		break
if flag==1:
	print "NO"
else:
	print "YES"

