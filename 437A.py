from operator import itemgetter

list = {}
list['A'] =len(raw_input(""))-2
list['B'] =len(raw_input(""))-2
list['C'] =len(raw_input(""))-2
list['D'] =len(raw_input(""))-2

v=sorted(list.values())
if v[3]/v[2] >= 2 :
	if v[1]/v[0] >= 2 :
		print 'C'
		
	else :
		for i in list :
			if list[i] == v[3] :
				print i
				break
else :
	if v[1]/v[0] >= 2 :
		for i in list :
			if list[i] == v[0] :
				print i
				break
	else :
		print 'C'
		
