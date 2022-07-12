# 리스트에 요소 삽입(insert)
# 리스트의 특정위치에 요소(값)을 삽입
# 원본에 리스트의 변경 발생
# 리턴값은 없다.
# insert(pos, value):
# - pos : 위치
# - value : 값

l = ['하나', '둘']
print(l)

# 위치 1번째 즉 값('둘') 앞에 '다음'을 삽입
l.insert(1,'다음')
print(l)

# 위치 처음(0번째) 즉 값('영')을 삽입
l.insert(0,'영')
print(l)

# 마지막에 삽입(append와 같은 효과)
l.insert(len(l), '마지막')
print(l)

# 리스트 뒤에 데이터 요소를 추가
l.append('THE END')
print(l)