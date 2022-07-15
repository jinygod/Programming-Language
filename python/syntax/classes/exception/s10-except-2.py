# 예외 처리
# 예외 만들기

class BirdException(Exception):
    pass

# 예외를 발생할 때 메시지를 전달
def HiBird(hi):
    if hi == 'dead':
        raise BirdException()
    print('Ok!', hi)

# 예외 처리
try:
    HiBird('fly')
    HiBird('dead')
except BirdException as e:
    print('새가 죽었습니다.', e)
