# findall()
# 정규식과 매치되는 모든 문자열(substring)을 리스트(list)로 리턴
import re
p = re.compile('[a-zA-Z]+')
result = p.findall('Life is too short, from 70 to 90 years.')
print(result)