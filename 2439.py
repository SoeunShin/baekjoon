# 별 찍기 2

n = int(input())
space = n-1
star = 1
for i in range(n):
    print(' '*space, '*'*star, sep='')
    space -= 1
    star += 1