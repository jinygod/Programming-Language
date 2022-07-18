class Calc:
    def __init__(self, cnt=0):
        self.result = 0
        cnt += 1

    def add(self, num):
        self.result += num
        cnt += 1
        return self.result

    def sub(self, num):
        self.result -= num
        return self.result

    def mul(self, num):
        self.result *= num
        return self.result

    def div(self, num):
        self.result /= num
        return self.result

class Calculator(Calc):
    def counter(cnt):
        cnt += 1

    def total(self):
        return self.result
    
    def average(self, cnt):
        return self.result / cnt 

c1 = Calculator()

print(c1.add(3))
print(c1.add(4))
print(c1.average())