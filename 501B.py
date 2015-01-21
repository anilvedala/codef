q=int(raw_input(""))
pairs=[list(map(str,raw_input("").split(" "))) for i in range(q)]
tree=[]
for i in pairs:
	flag=0
	for j in range(len(tree)):
		if tree[j][len(tree[j])-1]==i[0]:
			tree[j].append(i[1])
			flag=1
			break
	if flag==0:
		tree.append([i[0],i[1]])
print len(tree)
for i in tree:
	print i[0], i[len(i)-1]
