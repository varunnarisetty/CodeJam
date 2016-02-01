#!/usr/bin/python
import re
def solve(line):
    le = len(line)
    total_friends = 0
    total_standing = 0
    for i in range(le):
        val = int(line[i])
        # print(i)
        if i <= total_standing:
            total_standing = total_standing + val
        else:
            total_friends = total_friends + i - total_standing
            total_standing = i + val


    return total_friends




if __name__ == "__main__":
    k = open('input.txt', 'r')
    testcases = int(k.readline())
    for i in range(testcases):
        line = k.readline().split()[1]
        value = solve(line)
        print("case #"+str(i+1)+": "+str(value))

