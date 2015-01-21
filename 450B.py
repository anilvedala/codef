s=raw_input("")
s1=s.split(" ")
fi2=int(s1[0])
fi1=int(s1[1])
n=raw_input("")
n=int(n)
l=[-fi1+fi2,fi2,fi1,fi1-fi2,-fi2,-fi1]
print l[n%6]%1000000007

          
    
