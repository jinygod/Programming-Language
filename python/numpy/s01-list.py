# list

# 리스트(list)
l = [[1,2,3],[4,5,6]]
print(l)
print('type:',type(l))
print('len:', len(l))

print(l[0])
print(l[1])

print('[enumerate]')
for i, r in enumerate(l):   # 행의 인덱스와 리스트를 리턴
    print('r:', r)
    for j, c in enumerate(r):   # 열의 인덱스와 값을 리턴
        print(f"i[{i}], j[{j}]: {l[i][j]}, {c}") # [행][열]

# 값을 얻음
for r in l:   # 행을 리턴
    for c in r:   # 칼럼 값을 리턴
        print(f"{c}") 
        
# dir() 함수 : 속성, 메소드를 확인
print(">>> dir(list) <<<")
for i in dir(list):
    if not i.startswith('_'):
        print(i)
        
# 결과
"""
append
clear
copy
count
extend
index
insert
pop
remove
reverse
sort
"""