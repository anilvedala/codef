s1=(raw_input("")).split(" ")
n=int(s1[0])
m=int(s1[1])
k=int(s1[2])
s2=(raw_input("")).split(" ")
s3=[]
q=0
for i in range(n):
	s2[i]=int(s2[i])
for i in range(n-m+1):
	if m!=1:
		q=s2[i]
		for j in range(1,m):
			
			q=q+s2[i+j]
		s3.append(q)
list.sort(s3)
p=0
if m!=1:
    for i in range(k):
	
	    p=p+s3[len(s3)-1-i]
    print p
else:
	list.sort(s2)
	for i in range(k):
		p=p+s2[len(s2)-1-i]
	print p