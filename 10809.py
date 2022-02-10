# 알파벳 찾기

s = input()
alpha = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
for i in range(len(alpha)):
    if alpha[i] in s:
        print(s.index(alpha[i]), end = ' ')
    else:
        print(-1, end = ' ')