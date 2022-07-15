# 예외 처리
# 오류 발생시키기(raise)

# Bird를 상속받은 자식 클래스에서 fly() 메소드를 반드시 구현하도록 강제
class Bird:
    def fly(self):
        raise NotImplementedError("날 수 없습니다.")

class Eagle(Bird):
    def walk(self): # override method
        print('Eagle walk...')

try:
    bird = Bird()
    bird.fly()  # 예외발생
except NotImplementedError as e:
    print("Bird: ", e)

try:    
    eagle = Eagle()
    eagle.walk()
    eagle.fly() # 예외발생
except NotImplementedError as e:
    print("Eagle: ", e)