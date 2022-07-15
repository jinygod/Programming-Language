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
    def __init__(self, initval):
        print('CalcMinus.__init__()')
        super().__init__()
        self.result += initval
        print('CalcMinus.initval:', initval)

    # override: super()   
    def plus(self, num):
        print('plus:', num)
        return super().plus(num)

    def minus(self, num):
        self.result -= num
        print('minus:', num)
        return self.result

calc = CalcMinus(9)
print('result:', calc.plus(10))
print('result:', calc.minus(4))

# self?
print('Calc:', Calc.plus(calc, 10))
print('CalcMinus:', CalcMinus.minus(calc, 5))