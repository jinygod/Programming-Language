# 셋 초기값을 지정하여 생성

# 문자열
welcome = "환영합니다!"
print('welcome type=:', type(welcome))
print('welcome:', welcome)
print('welcome:', welcome)

# 문자열을 셋으로 선언 ( 문자를 하나씩 추출)
# 중복되는 문자는 하나만 남기고 지정
# 중복된 문자('e')는 하나만 들어감
weeks = set(welcome)
print('weeks: type=', type(weeks))
print('weeks: type=', len(weeks))
print('weeks: type=', weeks)
