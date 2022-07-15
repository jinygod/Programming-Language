# 그루핑(Grouping)
# 문자열을 반복해서 조사하는 정규식

import re

p = re.compile(r"\w+\s+\d+[-]\d+[-]\d+")    
m = p.search('lee 010-1234-5678')
print('[1]',m)

m = p.search('sunsinlee 010-1234-5678')
print('[2]',m)

m = p.search('sunsinlee 031-722-5678')
print('[3]',m)

m = p.search('sunsinlee 031-xxxx-5678') # None
print('[4]',m)
