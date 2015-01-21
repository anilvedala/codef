p=int(raw_input(""))
n=raw_input("")
low=[]
high=[]

for i in range(len(n)):
	if i<p:
		low.append(int(n[i]))
	else:
		high.append(int(n[i]))
flag=0
low=sorted(low)
high=sorted(high)
if low[0]<high[0]:
	for i in range(len(n)/2):
		if low[i]>=high[i]:
			flag=1
			break
else:
	for i in range(len(n)/2):
		if low[i]<=high[i]:
			flag=1
			break
if flag==1:
	print "NO"
else:
	print "YES"
