

def multi(a,b):
    if a == '1':
        return b
    if b == '1':
        return a
    if a == b:
        return '-1'
    if a == 'i' and b == 'j':
        return 'k'
    if a == 'i' and b == 'k':
        return '-j'
    if a == 'j' and b == 'i':
        return '-k'
    if a == 'j' and b == 'k':
        return 'i'
    if a == 'k' and b == 'i':
        return 'j'
    if a == 'k' and b == 'j':
        return '-i'


def multiply_value(a,b):
    if len(a) > 1 and len(b) > 1:
        return multi(a[1],b[1])
    if len(a) == 1 and len(b) == 1:
        return multi(a,b)
    if len(a) > 1:
        res = multi(a[1],b)
        if len(res) > 1:
            return res[1]
        else:
            return '-'+res
    else:
        res = multi(a,b[1])
        if len(res) > 1:
            return res[1]
        else:
            return '-'+res


def slove_for_i(line_i):
    val = line_i[0]
    if val == 'i':
        return 0
    for i in range(1,len(line_i)):
        val = multiply_value(val,line_i[i])
        if val == 'i':
            return i
    return -1


def solve_for_k(line_k):
    line_k = line_k[::-1]
    val = line_k[0]
    if val == 'k':
        return 0
    for i in range(1,len(line_k)):
        val = multiply_value(line_k[i],val)
        if val == 'k':
            return i
    return -1

def solve(line,repeat):
    val = line[0]
    reminder = repeat%4
    for i in range(1,len(line)):
        val = multiply_value(val,line[i])
    if val == '1':
        return 'NO'
    if val == '-1' and (reminder == 0 or reminder == 2):
        return 'NO'
    if val != '-1' and reminder != 2:
        return 'NO'
    i_index = slove_for_i(line*min(repeat,4))
    k_index = solve_for_k(line*min(repeat,4))
    if  (i_index > -1 and k_index > -1) and ( i_index + k_index ) < len(line)*repeat:
        return 'YES'
    else:
        return 'NO'


if __name__ == "__main__":
    k = open('input.txt', 'r')
    testcases = int(k.readline())
    for i in range(testcases):
        val = int(k.readline().split()[1])
        seq = k.readline().strip()
        print("Case #"+str(i+1)+": "+solve(seq,val))