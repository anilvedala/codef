import sys
s=map(int,list(raw_input("")))
if s[0]>=5:
	s[0]=9-s[0]
	if s[0]==0:
		s[0]=9
sys.stdout.write(str(s[0]))
for i in range(1,len(s)):
	if s[i]>=5:
		s[i]=9-s[i]
		sys.stdout.write(str(s[i]))
	else:
		sys.stdout.write(str(s[i]))
	




