import math
def solve(dinners,line):
    pancakes = line.split()
    pancakes = list(map(int, pancakes))
    max = 0
    for i in pancakes:
        if(i > max):
            max = i
    # print(pancakes)
    min_time = max
    # print(" max -"+str(max))
    for x in range(1,max+1):
        sum = 0
        for d in pancakes:
            sum = sum + math.ceil(d/x) - 1
        # print("for x --"+str(x)+ " --"+str(sum +x))
        min_time = min(min_time,sum + x)

    return min_time


if __name__ == "__main__":
    ip = open("input.txt",'r')
    testcases = int(ip.readline())
    for i in range(testcases):
        d = int(ip.readline())
        mins = solve(d,ip.readline())
        print("case #"+str(i+1)+": "+str(mins))


