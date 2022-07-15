# 그루핑(Grouping)
# 문자열을 반복해서 조사하는 정규식

import re

# 그룹핑 : 괄호로 감싼다.
# "ABC"가 한 번 이상 반복
p = re.compile('(ABC)+')    
m = p.search('ABCABCABC OK?')
print(m)
print(m.group(0))