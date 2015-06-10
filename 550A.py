import sys
s=raw_input("")
l=len(s)
flag=0
galf=0
count=[0]*l
i=0
c=0
if s=="BAB":
	print "NO"
	sys.exit()
while i<l-1:
	if s[i]=='A' and s[i+1]=='B':
		flag+=1
		count[i+1]=1
	elif s[i]=='B' and s[i+1]=='A':
		galf+=1
		count[i]=1
	i+=1
if flag!=0 and galf!=0:
	for i in count:
		if i>0:
			c+=1
	if c>1:
		print "YES"
	else:
		print "NO"
else:
	print "NO"


