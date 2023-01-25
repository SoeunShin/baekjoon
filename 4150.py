# 백준
# 4150. 피보나치 수

"""
import sys

def fibo(num):
    if num == 0:
        return 0
    elif num == 1 or num == 2:
        return 1
    else:
        return fibo(num-1) + fibo(num-2)

print(fibo(int(sys.stdin.readline())))

재귀를 사용하면 런타임 에러가 발생한다.
"""
import sys

n = int(sys.stdin.readline())

fibo = [0,1,1]

for i in range(3, n+1):
    fibo.append(fibo[i-1] + fibo[-2])

print(fibo[n])
