# 백준 1037. 약수 

input() # 약수의 개수는 필요하지 않아서 변수에 따로 저장하지 않았음 
arr = list(map(int, input().split()))

print(max(arr)*min(arr))