import math
l=map(int,raw_input("").split(" "))
h=l[0]
e=l[1]+long(math.pow(2,h))-1
nodes=1
values=[0]*int(math.pow(2,h+1))
level=0
index=1
move=0
goback=0
while 1>0:
    while level<h:
        values[index]=1
        if move==0:
            if values[2*index]==0:          
                index*=2
                level+=1
                nodes+=1
            else:
                if goback==1:
                    index/=2
                    level-=1
                    goback=0
                else:
                    goback=1
            move=1
        elif move==1:
            if values[2*index+1]==0:
                index=2*index+1
                level+=1
                nodes+=1
            else:
                if goback==1:
                    goback=0
                    index/=2
                    level-=1
                else:
                    goback=1
            move=0
        if index==e:
            break

    if index==e:
        break
    else:
        values[index]=1
        index/=2
        level-=1
        move=1-move
print nodes-1




