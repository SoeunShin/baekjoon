# X보다 작은 수

n, x = map(int, input().split())
arr = list(map(int, input().split()))

for i in range(n):
    if arr[i] < x:
        print(str(arr[i]), end = ' ')