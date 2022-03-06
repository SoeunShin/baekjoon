# 백준 1085. 직사각형에서 탈출

x, y, w, h = map(int, input().split())

distArr = [h-y, w-x, x, y]
dist = min(distArr)
print(dist)