def binary(s,p,q,find):
	if find==s[(p+q)/2]:
		return (p+q)/2
	elif p==q-1 or p==q:
		if find==s[q]:
			return q
		else:
			return -1
	elif find < s[(p+q)/2]:
		return binary(s,p,(p+q)/2,find)
	elif find > s[(p+q)/2]:
		return binary(s,(p+q)/2+1,q,find)
s=[9]
print binary(s,0,0,1)