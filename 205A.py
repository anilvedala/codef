n=int(raw_input(""))
s=raw_input("")
list=s.split(" ")
mini=int(list[0])
flag=1
c=1
for i in range(1,n):
	
	if int(list[i]) < mini:
		mini=int(list[i])
		flag=1
		c=i+1
		
	elif int(list[i])==mini :
		
		flag=0
if flag==1:
	print c
else :
	print "Still Rozdil"