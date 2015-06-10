s=raw_input("")
m=int(raw_input(""))
p=map(int,raw_input("").split(" "))
l=len(s)
for i in range(m):
	a=p[i]-1
	q=s[0:a]+s[(l-a+1):a-1:-1]+s[(l-a+2):l]
	s=q
print s
