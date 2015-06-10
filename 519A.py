weight={'q':9, 'r':5, 'b':3, 'n':3, 'p':1, 'k':0}
white=0
black=0
for i in range(8):
	l=list(raw_input(""))
	for i in l:
		if i=='.':
			continue
		if i.isupper():
			white+=h[i.lower()]
		else:
			black+=h[i]
if white>black:
	print "White"
elif white<black:
	print "Black"
else:
	print "Draw"



