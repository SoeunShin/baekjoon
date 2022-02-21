A = int(input())
B = input() # index를 사용해야 하기 때문에 int로 바꾸지 않음 

print(A*int(B[2]), A*int(B[1]), A*int(B[0]), A*int(B), sep='\n')