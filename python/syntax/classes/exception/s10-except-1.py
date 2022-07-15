# 예외 처리
# 예외 만들기
# 예외 메시지 등록

class BirdException(Exception):
    def __str__(self):  # 미리 정의된 메소드: 객체를 문자열로 리턴
        return '[Bird] 메시지를 받았습니다.'

class TigerException(Exception):
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

print('[1] 직접 객체 생성')
print(BirdException())
print(BirdException("새에게 메시지 전달"))

print('[2] 직접 객체 생성 및 메시지 전달')
print(TigerException("[Tiger] 사용자 메시지..."))