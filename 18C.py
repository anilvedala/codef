n=int(raw_input(""))
squares=map(int,raw_input("").split(" "))
s=sum(squares)
left=0
right=s
num=0
partition=0
for i in range(n-1):
	left+=squares[partition]
	right-=squares[partition]
	if left==right:
		num+=1
	partition+=1
print num


