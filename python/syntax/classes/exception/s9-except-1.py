# 예외 처리
# 예외 만들기
# 예외 기반 클래스: Exception
# Exception을 상속하여 사용자 예외 클래스를 정의 할 수 있다.

class BirdException(Exception):
    pass

def HiBird(hi):
    if hi == 'dead':
        raise BirdException()
    print('Ok!', hi)

HiBird('fly')