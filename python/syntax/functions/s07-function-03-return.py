# 함수
# 다중값 리턴

# n까지의 총합과 평균
def multi_return(n):
    if n < 0:
        return

    tot = 0
    for x in range(n+1):
        tot += x
    avg = tot / n
    return tot, avg

# n 의 총합과 평균
# n이 음수이면 모두 0을 리턴
n = -10
result = multi_return(n)
print('result=', result) # None
print(f'0부터 {n}까지의 총합과 평균')
if result != None:
    print('총합=', result[0])
    print('평균=', result[1])

print('총합=', result[0] if result != None else '값이 음수여서 게산하지 않음')
print('평균=', result[1] if result != None else '값이 음수여서 게산하지 않음')