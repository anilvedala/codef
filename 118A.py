s=raw_input("")
l=['a','i','e','o','u','A','E','I','O','U','y','Y']
s1=""
for i in range(len(s)):
	if s[i] not in l:
		s1=s1+"."+s[i].lower()
print s1		
