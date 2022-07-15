# 정규 표현식(Regular Expressions)

# 정규 표현식을 왜 필요로 한가?
import re

data = """park 800905-1049118
kim 700905-1059119"""

# 주민번호의 생년월일을 그룹핑
pat = re.compile("(\d{6})[-]\d{7}")

# 생년월일을 첫번째 그룹으로 사용해서 새로운 문자열로 대체
print(pat.sub("\g<1>-*******", data))