# 상속(inheritance)
# 기존의 클래스를 확장, 변경하여 새로운 클래스를 만들어 재사용
# 메소드 오버라이드(override) : 새로운 기능으로 대체

# class Calc
class Calc():
    def __init__(self):
        self.result = 0

    def plus(self, num):
        self.result += num
        return self.result

# class CalcMinus
class CalcMinus(Calc):
    # override           # 오버라이드 된것으로 대체가 된다.
    def plus(self, num):
        self.result += num
        print('plus:', num)
        return self.result

    def minus(self, num):
        self.result -= num
        print('minus:', num)
        return self.result

calc = CalcMinus()
print('result: plus(10) ->', calc.plus(10))
print('result: minus(4) ->', calc.minus(4))