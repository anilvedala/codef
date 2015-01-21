l=["q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l",";","z","x","c","v","b","n","m",",",".","/"]
shift=raw_input("")
s=raw_input("")
p=[]
for i in range(len(s)):
	if shift=="R":
		p.append(l[l.index(s[i])-1])
		
	else:
		p.append(l[l.index(s[i])+1])
print "".join(p)
		
