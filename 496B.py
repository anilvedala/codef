p=map(int,raw_input("").split(" "))
n=p[0]
k=p[1]
l=map(int,raw_input("").split(" "))
s=sum(l)
if s%k!=0:
    print s/k+1
else:
    print s/k