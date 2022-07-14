class Calc:
    # 생성자에 초기값 받음
    def __init__(self, num=10):
        self.result = num

    # 더하기 메서드
    def add(self, num):
        print('add({0}+{1})'.format(self.result, num))
        self.result += num
        return self.result

# 객체 생성
c10 = Calc()

print('c10:result=', c10.add(3))
print('c10:result=', c10.add(4))
print('c10:result=', c10.add(5))
print('c10:result=', c10.add(6))

print("[c20]")
c20 = Calc(100)
print('c20:result=', c20.add(3))
print('c20:result=', c20.add(4))
print('c20:result=', c20.add(5))
print('c20:result=', c20.add(6))