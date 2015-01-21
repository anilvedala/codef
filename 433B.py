s=raw_input("")
n=int(s)
s=raw_input("")
s1=s.split(" ")
sorte=[0]
l=[0]
answer=[]
for i in range(n):
	l.append(int(s1[i]))
	sorte.append(int(s1[i]))
list.sort(sorte)

for i in range(1,n+1):
	l[i]=l[i]+l[i-1]
	sorte[i]=sorte[i]+sorte[i-1]

n=int(raw_input(""))
for i in range(n):
	s2=[]
	s2=(raw_input("")).split(" ")
	if int(s2[0])==1:
		answer.append(l[int(s2[2])]-l[int(s2[1])-1])
	else:
		answer.append(sorte[int(s2[2])]-sorte[int(s2[1])-1])
for i in range(n):
	print answer[i]