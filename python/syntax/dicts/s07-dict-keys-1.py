# 딕셔너리 함수
# 딕셔너리의 키 목록 : dict.keys()
#   -> class dict_keys

cust = {
    'name' : '김수리',
    'tel' : '010-1234-5678'
}

print(cust)


# 딕셔너리의 키 목록
ck = cust.keys()
print(ck, type(ck))

# 딕셔너리의 키 목록을 리스트로 변환
lk = list(ck)
print(type(lk), lk)

# 튜플
tk = tuple(ck)
print(type(tk), tk)

# 리스트
print('딕셔너리의 키의 갯수:', len(lk))
name = lk[0]
tel = lk[1]

# 리스트의 인덱스의 키값을 변수에 할당
print(name, ':', cust[name]) # cust['name']
print(tel, ':', cust[tel]) # cust['tel']

# 리스트의 인덱스로 키값에 접근
print(lk[0], ':', cust[lk[0]]) # cust['name']
print(lk[1], ':', cust[lk[1]]) # cust['tel']