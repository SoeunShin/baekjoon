# 45분 일찍 알람 설정하기

h, m = map(int, input().split())

if m >= 45:
    m -= 45
else:
    res = 45 - m
    if h == 0:
        h = 23
    else: h -= 1
    m = 60 - res
print(h, m)