# 딕셔너리: built-in function
# del dict[key]
# 키값에 해당하는 하나의 요소를 삭제

dic = {}

dic['이름'] = '홍길동'
dic['나이'] = 35
dic['직업'] = '의적'
dic['거주지'] = '깊은 산속?'

print(dic)

# 키값으로 지우기
# 해당하는 키와 값을 삭제
del dic['이름']
print(dic)

# 존재하지 않는 키로 참조를 하면 오류 : 프로그램이 종료
# KeyError: '숫자'
print('이름:', dic['이름'])