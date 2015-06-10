def find(i,j):
	if left>right:
		return 1
	if s[left]==s[right]:
		print s
		find(left+1,right-1)
	else:
		return 0

s=raw_input("")
n=int(raw_input(""))
left=0
right=n/2
flag=0
flag=find(left,right)
if flag==1:
	left=n/2
	right=n
	
	flag=find(left,right)
	if flag==1:
		print "YES"
if flag==0:
	print "NO"
