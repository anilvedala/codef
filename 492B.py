s=(raw_input("")).split(" ")
n=int(s[0])
l=int(s[1])
co=(raw_input("").split(" "))
for i in range(len(co)):
	co[i]=int(co[i])
co=sorted(co)
dif=[]
if n!=1:
	for i in range(1,len(co)):
		dif.append((co[i]-co[i-1]))
	print max([float(max(dif))/2,float(co[0]),float(l-co[len(co)-1])])
else:
	print float(max([co[0],l-co[0]]))