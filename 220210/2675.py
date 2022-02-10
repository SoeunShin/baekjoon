# 문자열 반복

n = int(input())

for i in range(n):
    arr = list(input().split(' '))
    for j in range(len(arr[1])):
        print(arr[1][j] * int(arr[0]), end='')
    print()