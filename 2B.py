n=int(raw_input(""))
turn={}
count={}
pairs=[]
for i in range(n):
	pairs.append(raw_input("").split(" "))
for i in pairs:
	turn[i[0]]=0
	count[i[0]]=0
max=0
result=""
for i in range(1,n+1):
	count[pairs[i-1][0]]+=int(pairs[i-1][1])
	turn[pairs[i-1][0]]=i
	if count[pairs[i-1][0]]>max:
		max=count[pairs[i-1][0]]
		result=pairs[i-1][0]

print result

