n=int(raw_input(""))
s=raw_input("")
s1=s.split(" ")
s2=raw_input("")
s3=s2.split(" ")
l=[]
flag=0
for i in range(n):
	l.append(0)

for i in range(1,len(s1)):
	if int(s1[i])!=0:

	    if l[int(s1[i])-1]==0:
		    l[int(s1[i])-1]=1
for i in range(1,len(s3)):
	if int(s3[i])!=0:
	    if l[int(s3[i])-1]==0:
		    l[int(s3[i])-1]=1
for i in range(n):
	if l[i]==1:
		pass
	else:
		flag=1
if flag==1:
	print "Oh, my keyboard!"
else:
	print "I become the guy."

