n=input("")
n=int(n)
for i in range(int(n/2)):
	for j in range(int(n/2)-i):
		 print("*", end="")
	for k in range(2*i+1):
		 print("D", end="")
	for l in range(int(n/2)-i):
		 print("*", end="")
	print("")
		 	
             
for i in range(n):
	 print("D", end="")
print("")
for i in range(int(n/2)):
	for j in range(i+1):
		 print("*", end="")
	for k in range(int(n)-2*i-2):
		 print("D", end="")
	for l in range(i+1):
		 print("*", end="")

	print("")
    