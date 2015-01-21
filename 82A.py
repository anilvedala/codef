l=["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"]
s=5
st=5
n=int(raw_input(""))
i=0
while n > 5*((2 ** i)-1):
	i+=1
k=n-5*((2 ** i)-1)+5*(2 **(i-1))
if i==1:
	print l[k/i-1]
print l[k/(i)]
	
