import string
from collections import Counter
d1_low=dict.fromkeys(string.ascii_lowercase, 0)
d1_up=dict.fromkeys(string.ascii_uppercase, 0)
news_low=dict.fromkeys(string.ascii_lowercase, 0)
news_up=dict.fromkeys(string.ascii_uppercase, 0)
d=Counter(d1_low)
d=d+Counter(d1_up)
news=Counter(news_low)
news=news+Counter(news_up)
oops=0
yay=0
s=raw_input("")
news1=list(raw_input(""))
for i in s:
	d[i]+=1
for i in news1:
	news[i]+=1
for i in d:
	if d[i]<=news[i] and d[i]>0:
		news[i]-=d[i]
		yay+=d[i]
		d[i]=0
	elif d[i]>news[i] and d[i]>0:
		d[i]-=news[i]
		yay+=news[i]
		news[i]=0
for i in d:
	if i.islower():
		if news[i.upper()]<=d[i]:
			oops+=news[i.upper()]
			news[i.upper]=0
		else:
			news[i.upper()]-=d[i]
			oops+=d[i]
			d[i]=0
	else:
		if news[i.lower()]<=d[i]:
			oops+=news[i.lower()]
			news[i.lower()]=0
		else:
			news[i.lower()]-=d[i]
			oops+=d[i]
			d[i]=0
print yay,oops




