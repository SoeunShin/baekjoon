# 달팽이는 올라가고 싶다
import sys, math

A, B, V = map(int, sys.stdin.readline().split())

"""
아래과 같이 계산하면 시간 초과가 나온다.
height = 0
day = 0
while True:
    height += A
    day += 1
    if (height >= V): break
    height -= B
print(day)
"""

day = math.ceil((V-A)/(A-B)) + 1
print(day)

"""
나무 높이를 기준으로 식을 세워보면 (A-B) * N + A = V이다.
A만큼 올라갔다 B만큼 떨어지는 것을 반복하기 때문에 A-B만큼 올라가는 것을 N번 반복하고, 
마지막 날에는 A만큼 올라간 후 더 이상 떨어지지 않기 때문이다.

위의 식을 N에 대한 식으로 바꾸면
N = (V-A) / (A-B)이 된다.
N이 소수일 경우, 하루가 더 걸린 것과 같기 때문에 올림을 하기 위해서 math 모듈의 ceil 함수를 사용한다.
"""