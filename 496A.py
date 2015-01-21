n=int(raw_input(""))
l=(raw_input("").split(" "))
diff=[]
for i in range(n):
	l[i]=int(l[i])
	if i>=1:
		diff.append((l[i]-l[i-1]))
difficulty=max(diff)
combinations=[]
for i in range(len(diff)-1):
	p=diff[i]+diff[i+1]
	if p>difficulty:
		combinations.append(p)
	else:
		combinations.append(difficulty)
print min(combinations)


