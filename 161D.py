def check(t,node):
    global count
    global j

    if t==0:
        if j<node:
            if [j,node] in ans:
                pass
            else:
                ans.append([j,node])
                
                count+=1
                return 
        else:
            if [node,j] in ans:
                pass
            else:
                
                if j not in children[node]:
                    ans.append([node,j])
                    count+=1
                    return
    if t<0:
        return 
    for i in children[node]:
        if i!=j:
            check(t-1,i)
#ok



l=map(int,raw_input("").split(" "))
n=l[0]
k=l[1]
ans=[]
children=[[]]
for i in range(n):
    children.append([])
parent=[0]
for i in range(n):
    parent.append(0)
for i in range(n-1):
    l1=map(int,raw_input("").split(" "))
    if l1[0]>l1[1]:
        r=l1[0]
        l1[0]=l1[1]
        l1[1]=r
        
    parent[l1[1]]=l1[0]
    children[l1[0]].append(l1[1])
j=n
count=0
if k==1:
    print n-1
else:
    while j!=1:
        distance=0
        temp=j
        while parent[temp]!=0:
            distance+=1
            temp=parent[temp]
            check(k-distance,temp)
            if distance==k:
                #count+=1
                break
        
        j-=1
    print len(ans)




