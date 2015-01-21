s=raw_input("")
l=s.split(" ")
n=int(l[0])
m=int(l[1])
s1=raw_input("")
s2=raw_input("")
list1=s1.split(" ")
list2=s2.split(" ")
for i in list1:
	i=int(i)
for i in list2:
	i=int(i)
min1=min(list1)
max1=max(list1)
min2=min(list2)
max2=max(list2)
if max1/min1 >=2:
	if min2>max1 :
		print max1
	else :
		print "-1"
else :
    max1=2*min1
    if min2>max1 :
		print max1
	else :
		print "-1"
