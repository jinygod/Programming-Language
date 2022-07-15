# filename: mod3.py

def add(a, b):
    return a + b

def sub(a, b):
    return a - b

# __name__은 파이썬의 내장된 변수이다.
# 다른 모듈에서 해당 모듈을 호출하면 __name__은 모듈이름을 담고 있다.
print('[mod3.py]', __name__) # 둘 중 하나: "mod3", "__main__"

if __name__ == '__main__':
    print('>>> module mod3 <<<')
    a = 6
    b = 3
    print('add({0}, {1}) -> {2}'.format(a, b, add(a,b)))
    print('add({0}, {1}) -> {2}'.format(a, b, add(a,b)))