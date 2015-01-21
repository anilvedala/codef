def binary(s,p,q,find):
	if find<s[(p+q)/2]:
		binary(s,p,(p+q)/2,find)
	elif find>s[(p+q)/2]:
		binary(s,(p+q)/2+1,q,find)
	elif find==(p+q)/2:
		return p
	if p==q-1:
		return 0
		
		
l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
s=map(int,raw_input("").split(" "))
s=sorted(s)
count=0
tree=[]
while len(s)>0:
	poset=[]
	indices=[]
	i=0
	poset.append(s[i])
	indices.append(0)
	j=i+1
	length=len(s)
	flag=1
	x=0
	while flag:
		x=binary(s,0,length,k*s[i])
		if x!=0:
			i=x	
	for i in indices:
		del s[i-tmp]
		tmp+=1					
	tree.append(poset)
for i in tree:
	length1=len(i)
	if length1%2==0:
		count+=(length1/2)
	else:
		count+=(length1+1)/2
print count

