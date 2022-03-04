# 백준 3009. 네 번째 점 

x_co = []
y_co = []

for i in range(3):
    x, y = map(int, input().split())
    x_co.append(x)
    y_co.append(y)

for i in range(3): # 각 배열에서 중복되지 않은 숫자가 네 번째 점의 좌표이다. 
    if x_co.count(x_co[i]) == 1:
        x4 = x_co[i]
    if y_co.count(y_co[i]) == 1:
        y4 = y_co[i]

print(x4, y4)