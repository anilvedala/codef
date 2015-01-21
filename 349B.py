n=int(raw_input(""))
l=map(int,raw_input("").split(" "))
m=min(l)
answer=[]
for i in range(9):
	if l[8-i]==m:
		answer=[9-i]*(n/m)		
		break
if n%m!=0:
	maxi=0
	flag=1
	for i in range((n%m)+1):
		if (m+(n%m)-i) in l:
			if l.index((m+(n%m)-i))+1>maxi:
				maxi=l.index((m+(n%m)-i))+1
				flag=1
	if flag==1:
		answer.append(maxi)
		answer.remove(answer[0])
if n<m:
	answer=[-1]
reversed(answer)
print "".join(str(x) for x in answer)




