def right(row,col):
	if col==0:
		if s[row][col]==s[row][col+1]:
			template[row][col+1]=1
			right(row,col+1)
		return
	else:
		if s[row][col]==s[row+1][col]:
			template[row+1][col]=1
			down(row+1,col)
		if s[row][col]==s[row][col+1]:
			template[row][col+1]=1
			right(row,col+1)

def down(row,col):
	if check==1:
		return
	if row==n:
		if s[row][col]==s[row][col-1]:
			template[row][col-1]=1
			left(row,col+1)
		return
	else:
		if s[row][col]==s[row][col-1]:
			template[row][col-1]=1
			left(row,col-1)
		if s[row][col]==s[row+1][col]:
			template[row+1][col]=1
			right(row+1,col)

def left(row,col):
	if check==1:
		return
	if col==0:
		if s[row][col]==s[row-1][col]:
			template[row-1][col]=1
			left(row-1,col)
		return
	else:
		if s[row][col]==s[row+1][col]:
			template[row+1][col]=1
			up(row+1,col)
		if s[row][col]==s[row][col-1]:
			template[row][col-1]=1
			left(row,col-1)
def up(row,col):
	if template[row][col]==1:
		print "Yes"
		check=1
		return
	else:
		if s[row][col]==s[row+1][col]:
			template[row+1][col]=1
			up(row+1,col)
		if s[row][col]==s[row][col-1]:
			template[row][col-1]=1
			left(row,col-1)


		






check=0
l=map(int,raw_input("").split(" "))
n=l[0]
m=l[1]
s=[]
for i in range(n):
	s.append(list(raw_input("")))
template=[]
for i in range(n):
	template.append([0]*m)
for i in range(n-1):
	for j in range(m-1):
		if check==1:
			break
		if template[i][j]==0:
			template[i][j]=1
			right(i,j) 
