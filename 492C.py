s=(raw_input("").split(" "))
n=int(s[0])
r=int(s[0])
avg=int(s[2])
data=[]
for i in range(1000000):
	data.append([])
essays=[]
for i in range(n):
	w=(raw_input("").split(" "))
	essays.append(int(w[0]))
	data[int(w[1])].append(int(w[0]))

if sum(essays)>n*avg:
	print "0"
else:
	diff=n*avg-sum(essays)
	flag=1
	essays=sorted(essays)
	count=0
	while flag==1:
		if diff>=(r-data[essays[0]][0]):
			count+=(r-data[essays[0]][0])*essays[0]
			diff-=(r-data[essays[0]][0])
			essays.remove(essays[0])
		else:
			count+=(diff)*essays[0]
			flag=0
	print count







