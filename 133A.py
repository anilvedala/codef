s=raw_input("")
flag=0
for i in range(len(s)):
	if s[i]=='H' or s[i]=='Q' or s[i]=='9' :
		print "YES"
		flag=1
		break
if flag==0 :
	print "NO"