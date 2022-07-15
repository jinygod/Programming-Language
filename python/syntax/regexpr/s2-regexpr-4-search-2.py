# 정규 표현식(Regular Expressions)
# 정규 표현식에 사용하는 모듈

# search()
# 문자열의 처음부터 정규식과 매치되는 조사
import re

p = re.compile('[a-z]+')    # 반드시 알파벳으로 시작
m = p.search('3.7 python language')

if m:
    print('Match found:', m.group())
else:
    print('No match')