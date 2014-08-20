
n=int(raw_input(""))
s=raw_input("")
list =s.split(' ')
for i in range(n):
	list[i] = int(list[i])
list.sort()
a=list[n-1]-list[0]
k=1
j=1
for i in range(n-1):
	if list[n-1] == list[n-1-i-1] :
		k+=1
	else :
		break
for i in range(n-1):
	if list[0] ==list[i+1] :
		j+=1
	else :
		break
if k==n :
	print a , ((n-1) * n)/2
else :
	print a , k*j
