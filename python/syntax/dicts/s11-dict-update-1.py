# 딕셔너리 결합(update)
# 기존의 딕셔너리에 새로운 딕셔너리를 결합
# dict.update(newdict)

weeks = { 1:'월', 2:'화', 3:'수', 4:'목', 5:'금', 6:'토'}
sun = {0:'일'}

print(weeks)

# 기존의 딕셔너리에 새로운 딕셔너리를 결합
# dict.update(newdict)
weeks.update(sun) # weeks + sun
print(weeks)

print(weeks[0] + '요일')

# sun이 변경됨
sun.update(weeks) # sun + weeks
print(sun)

weeks = sun # 기존의 내용도 변경
print(weeks)