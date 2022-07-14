# 함수
# 다중값 리턴

# n까지의 총합과 평균
def multi_return(n):
    tot = 0
    for x in range(n+1):
        tot = 0
        for x in range(n+1):
            tot += x
        avg = tot / n
        return n, tot, avg

# 리턴이 다중인데 하나의 번호로 받으면
# 리턴되는 자료형은 튜플
# 0 부터 10까지 합과 평균
n, t, a = multi_return(10) # return : 개별적으로 리턴값이 변수에 할당
print(f'0부터 {n}까지의 총합과 평균')
print('총합=', t)
print('총합=', a)
