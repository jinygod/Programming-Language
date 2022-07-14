# 함수
# 가변인자로 입력받은 값의 평균값을 구하는 함수
# 조건: count를 하지 않고
def average(*args):
    print(f'{args}, len={len(args)}')

    total = 0

    for x in args:
        total += x
        print(f'x={x}, result={total}')

    return total / len(args)

print('평균=', average(1,3,5,7))      # 인자를 4개 전달