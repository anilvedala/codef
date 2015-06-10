n=int(raw_input(""))
answers=[]
sum=0.0
avg=0.0
len=1
last=0
for i in range(n):
	temp=map(int,raw_input("").split(" "))
	if temp[0]==1:
		sum+=(temp[1]*temp[2])	
	if temp[0]==2:
		sum+=temp[1]
		len+=1
		last=temp[1]
	else:
		sum-=last
		len-=1		
	if len==0:
		answers.append(0.000000)
	else:
		avg=sum/(len+0.0)
		answers.append(avg)
for i in answers:
	print i
