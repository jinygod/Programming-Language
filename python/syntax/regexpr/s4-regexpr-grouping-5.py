# 그루핑(Grouping)
# 문자열을 반복해서 조사하는 정규식

import re

# 이름만 뽑아냄
p = re.compile(r"(\w+)\s+(\d+[-]\d+[-]\d+)")    
m = p.search('Lee 010-1234-5678')
print(m.group(1))   # 이름
print(m.group(2))   # 전화번호