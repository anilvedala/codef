l=map(int,raw_input("").split(" "))
n=l[0]
t=l[1]
s=map(int,raw_input("").split(" "))
maxi=0
for i in range(len(s)):
	tmp=i
	count=0
	time=0
	while 1>0:
		time+=s[tmp]
		count+=1
		if time>t:
			count-=1			
		if time>=t:
			if count>maxi:
				maxi=count
				
				break
		if tmp==n-1:
			if count>maxi:
				maxi=count
						
				break
			break
		tmp+=1
print maxi




