# 튜플 언패킹(Unpacking)
# 튜플의 갯수와 변수의 갯수가 같아야 한다.
# variables = values

jobs = '요리사', '교사', '사무원'
print(type(jobs), jobs)

# 언패킹: 튜플의 갯수만큼 변수에 개별적으로 할당
chef, teacher, officer = jobs
print(chef)
print(teacher)
print(officer)

# 튜플의 갯수와 변수의 갯수가 같지 않으면 오류
# chef, teacher = jobs