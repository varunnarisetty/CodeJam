

def richard_wins(X, R, C):
  S = min(R, C)
  L = max(R, C)
  if (S * L) % X != 0: return True
  if X == 3 and S == 1: return True
  if X == 4 and S <= 2: return True
  if X == 5 and (S <= 2 or (S, L) == (3, 5)): return True
  if X == 6 and S <= 3: return True
  if X >= 7: return True
  return False

if __name__ == "__main__":
    k = open('input.txt', 'r')
    testcases = int(k.readline())
    for i in range(testcases):
        line = k.readline().split()
        print("Case #%d: %s" % (i + 1,"RICHARD" if richard_wins(int(line[0]), int(line[1]), int(line[2])) else "GABRIEL"))