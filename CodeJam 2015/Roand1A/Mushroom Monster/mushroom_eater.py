
def solve(line):
    max_rate = 0
    min_first = 0
    min_second = 0
    for i in range(1,len(line)):
        if max_rate < line[i-1]-line[i]:
            max_rate = line[i-1]-line[i]
        if line[i] < line[i-1]:
            min_first = min_first + line[i-1]-line[i]
    for i in range(0,len(line)-1):
        if line[i] < max_rate:
            min_second = min_second + line[i]
        else:
            min_second = min_second + max_rate

    return [min_first,min_second]

if __name__ == "__main__":
    ip = open("input.txt",'r')
    test_cases = int(ip.readline())
    for i in range(test_cases):
        d = int(ip.readline())
        input = list(map(int, ip.readline().split(" ")))
        min_tim = solve(input)
        print("case #"+str(i+1)+": "+str(min_tim[0])+" "+str(min_tim[1]))