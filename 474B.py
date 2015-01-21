def bin_search(start,p,q,x):
	if x>=start[(p+q)/2]:
		if (p+q)/2+1==len(start):
			return len(start)
		elif x<start[(p+q)/2+1]:
			return (p+q)/2+1
		return bin_search(start,(p+q)/2,q,x)
	elif x<start[(p+q)/2]:
		if x>=start[(p+q)/2-1]:
			return (p+q)/2
		return bin_search(start,p,(p+q)/2,x)

n=int(raw_input(""))
a=map(int,raw_input("").split(" "))
m=int(raw_input(""))
q=map(int,raw_input("").split(" "))
sum=0
start=[]
end=[]
for i in range(n):
	start.append(sum+1)
	end.append((sum+a[i]))
	sum+=a[i]
for g in q:	
	print bin_search(start,0,len(start),g)