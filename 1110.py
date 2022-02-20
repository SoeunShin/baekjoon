# 더하기 사이클 

num = int(input())
new = num
cycle = 0

while(1):
    a = new // 10       # 입력 받은 숫자의 10의 자리 
    b = new % 10        # 입력 받은 숫자의 1의 자리 
    c = (a + b) % 10    # 더한 숫자의 1의 자리 
    new = (b * 10) + c
    cycle += 1
    if(num == new): break
print(cycle)