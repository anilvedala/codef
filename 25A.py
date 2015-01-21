n=int(raw_input(""))
l=map(int,raw_input("").split(" "))
even=0
odd=0
p=0
odd_index=0
even_index=0
for i in range(len(l)):
	if l[i]%2==0:
		even+=1
		even_index=i+1
	else:
		odd+=1
		odd_index=i+1
if odd==1:
	print odd_index
else:
	print even_index



    

	

