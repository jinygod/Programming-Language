class Calc:
    def __init__(self):
        self.result = 0
        
    def add(self, num):
        self.result += num
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
