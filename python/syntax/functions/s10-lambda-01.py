# 람다(lambda)
# inline 함수, 익명함수
# 함수명 생략, 리턴(return) 생략
# 하나의 라인에 간결하게 표현하는 함수
# 함수형 프로그래밍

# 함수명 = lambda 파라미터 : 표현식

# 일반함수
def add(a, b):
    return a + b
result = add(10,20)
print('def: result=', result)

# 람다(익명함수)
# 함수선언을 하고 그 함수를 변수에 대입
lambda_add = lambda a, b: a + b
result = lambda_add(10,20)
print('lambda: result= ', result)

# 함수의 인자로 전달
# 함수인자로 a, b를 전달하여 두 수를 곱한 결과를 출력
multiple = lambda a, b : a * b
print('lambda: multiple=', multiple(10,20))