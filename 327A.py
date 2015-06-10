n=int(raw_input(""))
l=map(int,raw_input("").split(" "))
max=0
c=0
i=0
while i<n and l[i]==1:
    i+=1
    max+=1
c=max
if i==n:
    max=n-1
for j in range(i,n):
    if l[j]==0:
        c+=1
        if max<c:
            max=c
    else:
        
        max+=1
    #print c,max
print max

