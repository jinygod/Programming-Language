# class
# Calculator
# 생성자: 클래스가 객체화될 때 가장 먼저 실행되는 메소드, 자동으로 실행
# 소멸자 : 클래스가 더 이상 사용되지 않고 메모리에서 제거 될 때 자동으로 실행
# 생성자 : __init__(self)
# 소멸자 : __del__(self)
# self : 클래스 객체 식별자, 메소드의 제일 처음에 기술되어야 한다. 이름(self) 관례적으로 사용
# 객체의 메소드를 호출할 때 파라미터에 self를 기술하지 않음

class Calculator:
    def __init__(self): # 생성자(옵션)
        print("Calculator: 생성자 호출, self=", id(self))
        self.result = 0 # 클래스 멤버 변수(멤버변수)
    
    def __del__(self): # 소멸자(옵션)
        print("Calculator: 소멸자 호출, self=", id(self))

    # 더하기(method)
    def add(self, num):
        self.result += num
        return self.result
    
    # 빼기(method)
    def sub(self,num):
        self.result -= num
        return self.result

# 객체 생성
calc1 = Calculator()
calc2 = Calculator()

print('calc1:result=', calc1.add(4)) # 메소드 호출 
print('calc1:result=', calc1.sub(5)) 
print('calc2:result=', calc1.add(10)) 
print('calc2:result=', calc1.sub(20)) 
