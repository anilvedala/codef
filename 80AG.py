def isPrime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return False

    return True
s=raw_input("")
s=s.split(" ")

if isPrime(int(s[1])) == True :
    for i in range(int(s[0])+1,int(s[0]) **2):
    	if isPrime(i)==True :
    		if i== int(s[1]) :
    			print "YES"
    			break

    		else :
    			
    			print "NO"
    			break
else :
	print "NO"

