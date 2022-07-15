# 그루핑(Grouping)
# 문자열을 반복해서 조사하는 정규식

import re

# 이름만 뽑아냄
p = re.compile(r"(\w+)\s+\d+[-]\d+[-]\d+")    
m = p.search('lee 010-1234-5678')
print(m.group(0))   # 1번째 매치
print(m.group(1))   # 2번째 매치

# 매치되는 그룹을 벗어나면 오류
# print(m.group(2)) #IndexError no such group