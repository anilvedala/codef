import string
h=dict.fromkeys(string.ascii_lowercase, 0)
n=int(raw_input(""))
l=list(raw_input(""))
flag=0
for i in l:
	if i.isupper():
		h[i.lower()]+=1
	else:
		h[i]+=1
for i in h:
	if h[i]==0:
		print "NO"
		flag=1
		break
if flag==0:
	print "YES"
