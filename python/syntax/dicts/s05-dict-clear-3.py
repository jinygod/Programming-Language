# 딕셔너리

dic = {}
print(dic)
# 키가 없으면 새로 만들어 진다.
dic['이름'] = '홍길동'
dic['나이'] = 35
dic['직업'] = '의적'
dic['거주지'] = '깊은 산속?'
print(dic)
print(id(dic))
# 딕셔너리 지우기(비우기)
dic.clear()
print(id(dic))

# 새로운 메모리 할당: 비용발생
dic = {}
print(id(dic))

