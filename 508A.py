l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
k=l[2]
s=[[]]
flag=0
t1=0
for i in range(n):
	t=[0]*(m+1)
	s.append(t)
for i in range(k):
	l1=map(int,raw_input("").split(" "))
	row=l1[0]
	col=l1[1]
	s[row][col]=1
	if flag==1:
		continue
	if row<n and col<m:
		if n==1:
			t1=0
		elif s[row][col]+s[row][col+1]+s[row+1][col]+s[row+1][col+1]==4:
			t1=i+1
			flag=1
		elif row!=1 and s[row][col]+s[row][col+1]+s[row-1][col]+s[row-1][col+1]==4:
			t1=i+1
			flag=1
		elif row!=1 and col!=1 and s[row][col]+s[row][col-1]+s[row-1][col]+s[row-1][col-1]==4:
			t1=i+1
			flag=1
		elif col!=1 and s[row][col]+s[row][col-1]+s[row+1][col]+s[row+1][col-1]==4:
			t1=i+1
			flag=1
	elif row<n and col==m:
		if n==1:
			t1=0
		elif s[row][col]+s[row][col-1]+s[row+1][col]+s[row+1][col-1]==4:
			t1=i+1
			flag=1
		elif row!=1 and s[row][col]+s[row][col-1]+s[row-1][col]+s[row-1][col-1]==4:
			t1=i+1
			flag=1
	elif row==n and col<m:
		if n==1:
			t1=0
		elif row!=1 and s[row][col]+s[row-1][col]+s[row][col+1]+s[row-1][col+1]==4:
			t1=i+1
			flag=1
		elif col!=1 and s[row][col]+s[row-1][col]+s[row][col-1]+s[row-1][col-1]==4:
			t1=i+1
			flag=1
		
		elif row==1 and col==1:
			if s[row][col]+s[row][col+1]+s[row+1][col]+s[row+1][col+1]==4:
				t1=i+1
				flag=1

	elif row==n and col==m:
		if row==1:
			t1=0
		elif s[row][col]+s[row-1][col-1]+s[row][col-1]+s[row-1][col]==4:
			t1=i+1
			flag=1
print t1

