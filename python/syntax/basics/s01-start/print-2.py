# print(인자, end="...")
# 기본값: 라인피드(Line Feed), 다음 라인으로 이동

a = "안녕?"
b = "반가워요!"

print(a)    # LF
print(b)    # LF

# 다음라인으로 이동하지 않고 연결해서 출력
print(a, b)       # 공백
print(a, end=' ') # 공백
print(b)

# 전화번호
t1 = "010"
t2 = "1234"
t3 = "5678"
print(t1, end='-')
print(t2, end='-')
print(t3)

