import sys
n=int(raw_input(""))
if n%2==1 or n<4:
	print "NO"
elif n==6:
	print "YES"
	print "2 * 3 = 6"
	print "6 * 4 = 24"
	print "6 - 5 = 1"
	print "1 - 1 = 0"
	print "24 - 0 = 24"
else:
	print "YES"
	print "1 * 2 = 2"
	print "2 * 3 = 6"
	print "6 * 4 = 24"
	i=6
	c=0
	while i!=n+2:
		sys.stdout.write(str(i))
		sys.stdout.write(' ')
		sys.stdout.write('-')
		sys.stdout.write(' ')
		sys.stdout.write(str(i-1))
		sys.stdout.write(' ')
		sys.stdout.write('=')
		sys.stdout.write(' ')
		sys.stdout.write('1')
		print ""
		c+=1
		i+=2
	for i in range(c/2):
		print "1 - 1 = 0"
	for i in range(c/2):
		print "24 - 0 = 24"
