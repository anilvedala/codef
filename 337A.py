l=map(int,raw_input("").split(" "))
s=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
s=sorted(s)
i=0
mini=1000000
diff=0
while 1>0:
	diff=s[i+n-1]-s[i]
	i+=1
	if diff<mini:
		mini=diff
	if i==m-n+1:
		break
print mini
	



