s=raw_input("")
list=s.split(" ")
n=int(list[0])
m=int(list[1])
c=n
j=1
while c!=0:
	
	if j%m==0 and j/m >=1:
		
		c=c-1
		c+=1

	else :
		c=c-1
	j+=1

if n<m :
	print j-1
else :
	print j-1
