s=raw_input("")
list =s.split(' ')
for i in range(len(list)):
	list[i] = int(list[i])

a=list[0]-list[2]
b=list[1]-list[3]



 
if a == 0 :
	if b > 0:
		print list[0]+b , list[1] , list[2]+b ,list[3]
	else :
		print list[0]-b , list[1] , list[2]-b ,list[3]
elif b == 0:
	if a >0 :
		print list[0] , list[1]+a , list[2] ,list[3]+a
	else :
		print list[0] , list[1]-a , list[2] ,list[3]-a
elif a==b :
	if a > 0 :
		print list[0]+b , list[1] , list[2]-b ,list[3]
	else :
		print list[0] , list[1]-b , list[2] ,list[3]+b
elif a+b == 0:
	if a > 0 :
		print list[0]+b , list[1] , list[2]-b ,list[3]
	else :
		print list[0] , list[1]+a , list[2] ,list[3]-a
else:
	print "-1"






	

   


