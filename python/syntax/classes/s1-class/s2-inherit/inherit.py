# 상속(inheritance)
# 기존의 클래스를 확장, 변경하여 새로운 클래스를 만들어 재사용
# class 클래스이름(부모클래스):

# class Calc
class Calc():
    def __init__(self):
        self.result = 0

    def plus(self, num):
        self.result += num
        return self.result

# class CalcMinus
class CalcMinus(Calc):
    def minus(self, num):
        self.result -= num
        return self.result

calc = CalcMinus()
print('result:', calc.plus(10))
print('result:', calc.minus(4))