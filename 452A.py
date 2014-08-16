list =["vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"]
r=raw_input("")
s=raw_input("")
n=int(r)

for i in list:
	if len(i)==len(s) :
		flag=0
		for j in range(n):
			if s[j]!='.' :
 				if s[j]==i[j] :
 					pass
 					
 				else :
 					flag=1
 					
 					break
 		
 		if flag!=1 :
 			print i
 			break

