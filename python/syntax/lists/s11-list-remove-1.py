#리스트 요소 삭제(remove)

l = ['삼성', 'LG', 'SK', "Apple", '현대차']
print(l)

# remove는 리스트 객체의 함수
l.remove('LG')
print(l)

# 'SK'를 del를 사용하여 지우려면?
sk = l.index('SK')
del l[sk]
print(l)