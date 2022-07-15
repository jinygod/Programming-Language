# 그루핑(Grouping)
# 문자열을 반복해서 조사하는 정규식

import re

p = re.compile('(ABC)+')    
m = p.search('ABCABCABC OK? ABC!')
print(m)
print(m.group(0))
print(m.group)