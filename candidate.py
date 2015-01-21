
def inconsistent_with_G(instance,G):
	flag=1
	while flag==1:
		i=0
		send_signal=0
		while i<len(G):
			for j in range(len(attribute)):
				if G[i][j]!='?':
					if instance[j]!=G[i][j]:
						G.pop(i)
						send_signal=1
						i+=1
						break
			i+=1
		if send_signal==0:
			flag=0
			






def inconsistent_with_S(instance,S):         #removes that hypothesis in S that is inconsistent with a negative instance.
	for i in range(len(S)):
		c=0
		for j in range(len(attribute)):
			if S[i][j]!='?' and S[i][j]!='0':
				if instance[j]==S[i][j]:
					c+=1
			elif S[i][j]=='0':
				pass
			else:
				c+=1
		if c==len(attribute):
			list.remove(S,S[i])
			i=i-1

def generalize_S(instance):                  #generalizing Specific boundary space when a positive instance is observed.
	for i in range(len(S)):
		for j in range(len(instance)-1):
			if instance[j]!=S[i][j]:
			    if S[i][j]=='0':
				    S[i][j]=instance[j]
			    elif S[i][j]=='?':
				    pass
			    else:
				    S[i][j]='?'

def specialize_G(instance):
	to_be_removed_g=[]
	to_be_added_to_G=[]
	for i in range(len(G)):
		for j in range(len(attribute)):
			no_of_same_attribute_values=0
			if G[i][j]=='?':
				if G[i][j]!=instance[j]:
					for attribute_value in attribute[j]:
						if attribute_value!=instance[j]:
							new_hypothesis=['0','0','0','0','0']
							if G[i] not in to_be_removed_g:
							    to_be_removed_g.append(G[i])                   #index is stored so that this 'g' will be removed at end.
							for k in range(5):
								if k==j:
									new_hypothesis[k]=attribute_value
								else:
									new_hypothesis[k]=G[i][k]
							to_be_added_to_G.append(new_hypothesis)       #added to a temporary list which after all iterations,will be added to G
			else:
				if G[i][j]==instance[j]:
					no_of_same_attribute_values+=1
		if no_of_same_attribute_values==len(attribute):
			to_be_removed_g.append(G[i])                                      #if a 'g' has all values same as instance,remove that 'g'
	#print to_be_removed_g
	for i in range(len(to_be_removed_g)):
		p=to_be_removed_g[i]
		G.remove(p)
	for i in range(len(to_be_added_to_G)):
		G.append(to_be_added_to_G[i])
	

    


def remove_g_if_not_general_than_some_s(S,G):
	flag=1
	while flag==1:
		i=0
		send_signal=1                           #if any 'g' is to be removed,we should break out of loop.this variable does that.
		while i<len(G):
			for j in range(len(S)):             #traversing through each 's' in 'S'
				for k in range(len(attribute)): #looking at each attribute.
					if S[j][k]!=G[i][k] and S[j][k]!='0':
						if G[i][k]!='?':
							G.pop(i)
							send_signal=0
							break
				if send_signal==0:
					break
			if send_signal==0:
			    break
			i=i+1
		if send_signal==1:
			flag=0
		    
		
def remove_g_inconsistent_with_h(instance):
	flag=1
	while flag==1:
		send_signal=0
		i=0
		while i<len(G):
			no_of_same_attribute_values=0
			for j in range(len(attribute)):
				if instance[j]==G[i][j]:
					no_of_same_attribute_values+=1
				elif G[i][j]=='?':
					no_of_same_attribute_values+=1
			if no_of_same_attribute_values==len(attribute):
				G.pop(i)
				send_signal=1
				break
			i+=1
		if send_signal==0:
			flag=0


def consistent_hypothesis():                      #method to print all the consistent hypothesis
	while 1<2:
		outer_flag=0                              #this variable is set to 1 for coming out of loop
		i=0
		while i in range(len(S)):
			for j in range(len(G)):
				flag=0                                #flag will be assigned 1 in below loop if 'g' is not general than 's'.
				for k in range(len(attribute)):
					if consistent_set[i][k]!='?' and G[j][k]!='?' and consistent_set[i][k]!=G[j][k]:
						flag=1
						break
				if flag==0:                       #flag is zero when 's' is specific than 'g'
					for k in range(len(attribute)):
						if consistent_set[i][k]!='?' and G[j][k]=='?':
							new_hypo=[]           #a specific hypothesis than 's' will be stored in this list in below steps.
							for l in range(len(attribute)):
								if l==k:
									new_hypo.append("?")
								else:
									new_hypo.append(consistent_set[i][l])
							if new_hypo not in consistent_set:
								consistent_set.append(new_hypo)  #appending to consistent hypothesis set.
								outer_flag=1

			i+=1
		if outer_flag==0:                             #iterating through consistent hypothesis set will be stopped with this step.
			break
	
																																						
						
						
	
attribute=[['round','square'],['triangle','square'],['round','square'],['purple','green','yellow'],['yes','no']]                           #storing all possible values of attributes.

G=[['?','?','?','?','?']]                            #initial G Boundary
S=[['0','0','0','0','0']]                            #initial S Boundary
consistent_set=[]
file1 = open('dataset2.txt','r')                      #file pointer to read dataset
s=""
print "G0:",G
print "S0:",S
print ""
for i in range(5):                                   #for loop runs 5 times as there are 5 instances of data
	s=file1.readline( )                              #reading as a line
	
	instance=s.split(" ")                            #splitting each value into a list.
	for j in range(5):
		if instance[j] not in attribute[j]:
			attribute[j].append(instance[j])         #storing all the values that each attribute can take.

	if instance[5][0]=='y':	
		inconsistent_with_G(instance,G)
		generalize_S(instance)
	elif instance[5][0]=='n':
		inconsistent_with_S(instance,S)              #remove those s that are inconsistent with current instance
		specialize_G(instance)                       #specializing G
	
		remove_g_if_not_general_than_some_s(S,G)     #removin those 'g' that are not general than any of 'S'.
		remove_g_inconsistent_with_h(instance)



        
         
	                                                 ##remove_g_if_less_general_than_some_g(G)
	print "G",(i+1),":",G
	print "S",(i+1),":",S
	print ""
consistent_set=S                                     #copying S to consistent hypothesis set.
consistent_hypothesis()
for j in range(len(G)):
	if G[j] not in consistent_set:                   #adding g to consistent hypothesis set
		consistent_set.append(G[j])            
print "set of all consistent hpothesis:" ,consistent_set    

     