# 예외 처리
# 예외 만들기

class BirdException(Exception):
    def __init__(self, msg, ecd = 'ERROR'): # 생성자
        self.msg = msg
        self.ecd = ecd

    def __str__(self): # 재정의
        return "Why: '{}' 메시지에 의해서 예외가 발생했습니다".format(self.msg)

    def why(self):  # 사용자 정의 메소드
        return self.ecd

def HiBird(hi):
    if hi == 'dead':
        raise BirdException(hi)
    elif hi == 'stop':
        raise BirdException(hi, "WARN")
    print('Ok!', hi)

# 예외 처리
try:
    HiBird('fly')
  #  HiBird('dead')
    HiBird('stop')
except BirdException as e:
    print('오류코드:', e.why())
    print(e)

