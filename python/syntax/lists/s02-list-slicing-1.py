# list의 슬라이싱
# 리스트의 지정된 위치의 자료를 꺼내서 새로운 리스트를 생성
# 기존의 리스트는 변경되지 않는다.

a = [1,2,3,4,5]
b = a[2:-1] # 인덱스 2부터 끝까지
lastpos = len(a) - 1
print('lastpos=', lastpos)
print(a)
print('a[2:-1] : ', b) # [3,4]