




a,b=map(int,raw_input("").split(" "))
counter=a/b
y=a%b
x=b
while x!=0 and y!=0:
	counter+=1
	if x<y:
		k=x
		x=y
		y=k
	x=x-y

print counter