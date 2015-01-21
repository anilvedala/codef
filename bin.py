def binary(s,p,q,find):
	if find<s[(p+q)/2]:
		binary(s,p,(p+q)/2,find)
	elif find>s[(p+q)/2]:
		binary(s,(p+q)/2+1,q,find)
	elif find==(p+q)/2:
		return p
	if p==q-1 or p==q:
		return 0

s=[2,4,6,8]
print binary(s,0,3,1)