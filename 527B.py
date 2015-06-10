n=int(raw_input(""))
s=raw_input("")
t=raw_input("")
diff_ind=[]
count={}
for i in range(n):
	if s[i]!=t[i]:
		diff_ind.append(i)
		count[s[i]]=-1
		count[t[i]]=-1
different=len(diff_ind)
for i in range(different):
	count[s[diff_ind[i]]]=diff_ind[i]
x=0
y=0
flag=0
for i in range(different):
	if count[t[diff_ind[i]]]!=-1:
		flag=1
		x=count[t[diff_ind[i]]]+1
		y=diff_ind[i]+1
		if s[x-1]==t[y-1] and s[y-1]==t[x-1]:
			different-=1
			break
if flag==1:
	print different-1
	print x,y
else:
	print different
	print "-1 -1"

