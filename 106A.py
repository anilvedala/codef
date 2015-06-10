rank=["6", "7", "8", "9", "T", "J", "Q", "K", "A"]
trump=raw_input("")
l=raw_input("").split(" ")
first=l[0]
second=l[1]
if first[0]==trump or (first[0]==second[0] and rank.index(first[1])>rank.index(second[1])):
	print "YES"
else:
	print "NO"
