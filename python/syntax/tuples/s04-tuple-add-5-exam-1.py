# 튜플 더하기 

# [문제]
# 아래의 튜플 데이터에서 인덱스 2번의 데이터를 10으로 바꿔라
# 조건: 변수 tv, tx를 이용해서 문제를 해결하라
tv = 10 # 바꿀 값
tx = 2 # 바꿀 위치
tp = (1,3,5,7,9)
print(tp)

print('tp[%d]=[%d]' % (tx, tp[tx]))

# tuple -> list
tl = list(tp)
tl[tx] = tv
print(tl)

# list -> tuple
tp = tuple(tl)

# 결과 : (1,3,10,7,9)
print(tp)