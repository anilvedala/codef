n=int(raw_input(""))
first_set=map(int,raw_input("").split(" "))
second_set=map(int,raw_input("").split(" "))
third_set=map(int,raw_input("").split(" "))
first={}
second={}
third={}
for i in first_set:
	first[i]=0
	second[i]=0
	third[i]=0
for i in first_set:
	first[i]+=1
for i in second_set:
	second[i]+=1
for i in first:
	if first[i]!=second[i]:
		print i
		break
for i in third_set:
	third[i]+=1
for i in second:
	if second[i]!=third[i]:
		print i
		break
