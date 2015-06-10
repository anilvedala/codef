import sys
n=int(raw_input(""))
l=map(int,list(raw_input("")))
ans=[]
count=[0,0,0,0,0,0,0,0,0,0]
for i in l:
	count[i]+=1
for i in range(1,9):
	if 10-i==4 and count[10-i]>0:
		count[2]+=(count[4]*2)
		count[3]+=count[4]
	elif 10-i==6 and count[10-i]>0:
		count[5]+=count[6]
		count[3]+=count[6]
	elif 10-i==8 and count[10-i]>0:
		count[7]+=count[8]
		count[2]+=(count[8]*3)
	elif 10-i==9:
		count[7]+=count[9]
		count[3]+=(2*count[9])
		count[2]+=(3*count[9])
	else:
		ans.extend([10-i]*count[10-i])
for i in ans:
	sys.stdout.write(str(i))

