import math

def getDoneAtMin(input,m):
    numberDone =0
    for i in input:
        numberDone = numberDone + math.ceil(m/i)
    return numberDone

def solve(input,k):
    start = 0
    end = 1;
    while(getDoneAtMin(input,end) < k):
        end = end*2
    mid = math.floor((start + end)/2)

    while not(getDoneAtMin(input,mid+1) >=k and getDoneAtMin(input,mid) < k):
        if (getDoneAtMin(input,mid) >= k):
            end = mid
        else:
            start = mid
        mid = math.floor((start + end)/2)


    if (getDoneAtMin(input,mid+1) >=k and getDoneAtMin(input,mid) < k):
        diff = k - getDoneAtMin(input,mid)
        return [mid,diff]





if __name__ == "__main__":
    ip = open("input.txt",'r')
    test_cases = int(ip.readline())
    for i in range(test_cases):
        input = list(map(int, ip.readline().split(" ")))
        n = input[1]
        barber_time = list(map(int, ip.readline().split(" ")))
        min_tim = solve(barber_time,n)
        count =0
        for j in range(0,len(barber_time)):
            if min_tim[0]%barber_time[j] == 0:
                count = count+1;
                if count == min_tim[1]:
                    print("Case #"+str(i+1)+": "+str(j+1))
                    break
