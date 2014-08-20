s=raw_input("")
if len(s) >=2 :
	
    a= int(s[len(s)-2]) * 10 + int(s[len(s)-1])
    a = a%4
else :
	a=int(s[len(s)-1])
	a=a%4
list2=[6,2,4,8]
list3=[1,3,9,7]
list4=[6,4,6,4]
print (1 + list2[a] + list3[a] + list4[a])%5