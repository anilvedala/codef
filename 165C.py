n=int(raw_input(""))
s=list(raw_input(""))
next1=[]
su=0
l=len(s)
flag=1
for i in range(l):
	k=0
	while 1>0:
		k+=1
		if i+k==l:
			k=0
			break
		if s[i+k]=='1':
			break
	next1.append(k)
queue=0
last=0
check=0
for i in range(l):
	if s[i]=='0':
		queue+=1
	if s[i]=='1':
		left=n-1
		if check==0:
			ind=i
			while left!=0:
				ind+=next1[ind]
				if next1[ind]==0:
					flag=1
					break
				left-=1
			check=1
			if flag==1:
				break
			su+=((queue+1)*next1[ind])
			ind+=next1[ind]
			last=next1[ind]
		else:
			su+=((queue+1))*last
			ind+=next1[ind]
			last=next1[ind]
print su

