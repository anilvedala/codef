n=int(raw_input(""))
l=map(int,raw_input("").split(" "))
count=[]
for i in range(101):
	count.append(0)
for i in l:
	count[i]+=1
c2=0
for i in range(1,101):
	c2+=(count[i]/2)
print c2/2