# 딕셔너리

d = {}

# 값에 리스트, 튜플, 사전형 데이터를 넣을 수 있다.
d['홀수'] = [1,3,5] # 리스트값
d['짝수'] = [2,4,6] # 리스트값
d['숫자'] = (1,2,3) # 튜플값
d['튜플'] = 1,2,3 # 튜플값
d['사전'] = {'name' : '홍길동'}
print(d)

print(d['홀수'], type(d['홀수']))
print(d['짝수'], type(d['짝수']))
print(d['숫자'], type(d['숫자']))
print(d['튜플'], type(d['튜플']))
print(d['사전'], type(d['사전']))