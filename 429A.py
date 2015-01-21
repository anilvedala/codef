def flip(node):
	global count
	global flag
	
	if count==1:
		value[node-1]=1-value[node-1]
		print value
		count=0
	elif count==0:
		count=1
	if len(children[node])==0:
		flag=1
		#count=1-count
		flag=0
		return
	for i in range(len(children[node])):
		flip(children[node][i])
	count=1-count
#main....
n=int(raw_input(""))
children=[[]]
for i in range(n):
	children.append([])
for i in range(n-1):
	s=map(int,raw_input("").split(" "))
	if s[0]>s[1]:
		children[s[1]].append(s[0])
	else:
		children[s[0]].append(s[1])
value=map(int,raw_input("").split(" "))
goal=map(int,raw_input("").split(" "))
changes=0
count=1
node1=[]
flag=0
print children
for i in range(n):
	if value[i]!=goal[i]:
		node1.append(i+1)
		changes+=1
		flip(i+1)
		count=1
		print "after"
		print value

print changes
for i in node1:
	print i

