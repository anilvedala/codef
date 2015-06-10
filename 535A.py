units=["zero","one","two","three","four","five","six","seven","eight","nine"]
tens=["","","twenty-","thirty-","fourty-","fifty-","sixty-","seventy-","eighty-","ninety-"]
mid=["ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"]
n=int(raw_input(""))
if n<10:
	print units[n%10]
elif n<20:
	print mid[n%10]
elif n==20:
	print "twenty"
else:
	print tens[n/10]+units[n%10]
