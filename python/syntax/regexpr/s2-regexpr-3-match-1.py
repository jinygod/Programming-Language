# 정규 표현식(Regular Expressions)
# 정규 표현식에 사용하는 모듈

# match() :
# 문자열의 처음부터 정규식과 매치되는 조사
import re

p = re.compile('[a-z]+')    # 반드시 알파벳으로 시작
print(p.match('python'))
print(p.match('python is easy!!!'))

# 매치되지 않으면 None을 리턴
m2 = p.match('3 python')
print(m2)