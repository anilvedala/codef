n=int(raw_input(""))
boys=map(int,raw_input("").split(" "))
m=int(raw_input(""))
girls=map(int,raw_input("").split(" "))
boys.sort()
girls.sort()
count=0
while girls and boys:
	if girls[0]-boys[0]<=1 and girls[0]-boys[0]>=-1:
		girls.remove(girls[0])
		boys.remove(boys[0])
		count+=1
	else:
		if girls[0]<boys[0]:
			girls.remove(girls[0])
		else:
			boys.remove(boys[0])
print count