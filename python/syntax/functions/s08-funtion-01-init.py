# 함수
# 매개변수 초깃값(기본값, default value)

# z는 초깃값으로 5가 지정되어 있다.
# 함수 move를 호출할 때 z값을 지정하지 않으면
# 초깃값으로 5가 지정된다.
def move(x, y, z=5):
    print('[이동경로]')
    print('x축: ', x)
    print('y축: ', y)
    print('z축: ', z)

# 최소한 x,y 값을 전달해야 한다.
# move()

move(10,20,z=30)    # 10,20,30
move(10,20)         # 10,20,z=5
move(10,20,z=5)    