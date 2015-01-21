s1=(raw_input()).split(" ")
n=int(s1[0])
m=int(s1[1])
mini=100000
p=0
flag=1
for i in range(0,n+1):
	p=n-i
	if p%m == 0:
		if p < mini and p!=0:
			mini=p
			flag=0
if flag==0:
	print mini
else:
	print "-1"



