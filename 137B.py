n=int(raw_input(""))
l=map(int,(raw_input("").split(" ")))
a=[0]*n
count=0
for i in l:
	if i<=n and a[i-1]==0:
		count+=1
		a[i-1]=1
print n-count
