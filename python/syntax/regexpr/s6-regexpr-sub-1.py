# 그루핑(Grouping)
# 문자열을 반복해서 조사하는 정규식

# 문자열 바꾸기

import re

# 정규식과 매치되는 부분을 다른 문자로 바꾸기
p = re.compile('(blue|white|red)')
m = p.sub('color', 'blue socks and red shoes')
print(m)