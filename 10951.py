# 입력이 끝날 때까지 A+B

while True:
    try:
        A, B = map(int, input().split())
        print(A +B)
    except EOFError:
        break