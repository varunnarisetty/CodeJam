from math import sqrt

def isPrime(number):
    for i in range(2,int(sqrt(number))+1):
        if number%i == 0:
            return False
    return True

def isCircularPrime(number,list):
    numstr = str(number)
    lenn  = len(numstr) -1

    for i in range(0,lenn):

        
        string1 = numstr[i+1:lenn+1]

        string2 = numstr[0:i+1]

        string3 = string1 + string2 

        num = int(string3)

        if(num not in list):
            return False
    return True


def main(n):
    
    print n
    
    list = []
    
    for i in range(2,n):
        if isPrime(i):
            list.append(i)

    print "----------------"
    print "size -->"+str(len(list))
    print "----------------"
    count = 0;
    for item in list:
        if isCircularPrime(item,list):
            print item
            count += 1
    print count
    

main(1000000)
    


    
    
