s=raw_input("")
l=list(s)
maxi=0
ind=0
flag=0
n=len(l)
for i in range(n):
	if int(l[n-i-1])%2==0:
		if int(l[i])>=maxi and ((int(l[n-i-1])<=int(l[n-1])) or maxi==0):
			ind=n-i-1
			maxi=int(l[n-i-1])
			flag=1
		#elif int(l[i])>=maxi and maxi==0:

if flag==0:
	print "-1"
else:
	l[ind]=l[len(l)-1]
	l[len(l)-1]=str(maxi)
	print ''.join(l)