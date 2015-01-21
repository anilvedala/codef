n=int(raw_input(""))
s=raw_input("")
c=0
for i in range(n):
	if int(s[i])==1:
		while int(s[i])==1:
			c+=1
			
			i+=1
			if i==n:
				break
		break
	else:
	    break	
   

if c==n:
	print c
else:
	print c+1

