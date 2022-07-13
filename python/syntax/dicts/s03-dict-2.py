# 딕셔너리

dic = {}
print(dic)
# 키가 없으면 새로 만들어 진다.
dic['이름'] = '홍길동'
dic['나이'] = 35
dic['직업'] = '의적'
dic['거주지'] = '깊은 산속?'
dic[1500] = '홍길동 소설이 작성된 연도'
dic['pi'] = 3.141592

print(dic)

print(dic['이름'])
print(dic['나이'])
print(dic['직업'])
print(dic['거주지'])
print(dic[1500])
print(dic['pi'])