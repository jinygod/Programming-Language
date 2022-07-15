# 예외 처리
# 오류 발생시키기(raise)

# Bird를 상속받은 자식 클래스에서 fly() 메소드를 반드시 구현하도록 강제
class Bird:
    def fly(self):
        raise NotImplementedError

class Eagle(Bird):
    pass

eagle = Eagle()
eagle.fly() # NotImplementedError 예외 발생