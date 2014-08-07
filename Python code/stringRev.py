sub1 = ""
def strRev(st,len,st1):
    if(len != 0):
        global sub1
        sub1 = st1 + st[len-1:len]
        sub2 = st[0:len-1]
        return strRev(sub2,len-1,sub1)
    return sub1
def main(str):
    leng = len(str)
    revStr = strRev(str, leng, "")
    print revStr

   
main("Hello")
