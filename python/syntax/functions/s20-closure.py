# function
# 클로져(closure)
# 내부함수는 클로저처럼 행동 가능
# 클로저는 다른 함수에 의해 동적으로 생성
# 외부함수로부터 생성된 변수값을 변경하고 저장 가능

# 외부함수 score()에 의해 minmax() 함수가 동적으로 생성되고 복사본 반환

def score(*args):   # 외부함수
    print('score', args)
    def minmax():   # 내부함수
        min = -1
        max = -1
        for val in args:
            if min == -1 or val < min:
                min = val
            if max == -1 or val > max:
                max = val
        return min, max
    return minmax   # 내부함수를 리턴

# minmax() 함수의 변수값을 알고 있는 클로져
s1 = score(100,90,60,70,80)
s2 = score(99,88,77,66,55)

print(s1())
print(s2())