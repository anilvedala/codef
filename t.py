first=[]
second=[]
s=map(int,(raw_input("")).split(" "))
n=s[0]
m=s[1]
for i in range(m):
	w=(raw_input("")).split(" ")
	first.append(w[0])
	second.append(w[1])
t=raw_input("").split(" ")
for x in t:
	if x in first:
		f=min([len(first[first.index(x)]),len(second[first.index(x)])])
		if f==len(first[first.index(x)]):
			print first[first.index(x)] ,
		else:
			print second[first.index(x)] ,
	else:
		f=min([len(first[second.index(x)]),len(x)])
		if f==len(first[second.index(x)]):
			print first[second.index(x)] ,
		else:
			print second[second.index(x)] ,





