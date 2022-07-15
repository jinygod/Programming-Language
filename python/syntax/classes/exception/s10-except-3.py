# 예외 처리
# 예외 만들기

class BirdException(Exception):
    pass

# 예외를 발생할 때 포맷스트링 메시지를 전달
def HiBird(hi):
    if hi == 'dead':
        raise BirdException("'{}' 메시지에 의해서 예외가 발생 했습니다".format(hi))
    print('Ok!', hi)

# 예외 처리
try:
    HiBird('fly')
    HiBird('dead')
except BirdException as e:
    print('새가 죽었습니다.', e)
