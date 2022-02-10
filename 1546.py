# 평균

n = int(input())
arr = list(map(int, input().split()))

max = max(arr)
sum = 0
for i in range(n):
    sum += (arr[i]/max*100)
print(sum/n)