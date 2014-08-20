list =["vaporeon", "jolteon", "flareon", "espeon", "umbreon", "leafeon", "glaceon", "sylveon"]
r=input("")
s=input("")
n=int(r)
flag=0
for i in list:
	if len(i)==len(s) :
		for j in range(n):
			if s[j]!='.' :
 				if s[j]==i[j] :
 					pass
 				else :
 					flag=1
 			     	break
 		if(flag==0) :
 			print(i)
 		    break



			
