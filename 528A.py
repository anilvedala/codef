n=int(raw_input(""))
s=list(raw_input(""))
keys={}
buys=0
for i in range(2*n-2):
	keys[s[i].lower()]=0
for i in range(n-1):	
	if s[2*i]!=(s[2*i+1]).lower():
		if keys[(s[2*i+1]).lower()]!=0:
			keys[(s[2*i+1]).lower()]-=1
		else:
			buys+=1
		keys[s[2*i]]+=1
print buys
