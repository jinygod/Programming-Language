# finditer()
# 정규식과 매치되는 모든 문자열(substring)을 반복가능한 객체로 돌려준다.
import re
p = re.compile('[a-z]+')
result = p.finditer('life is too short')
print(result)

for r in result:
    print(r)