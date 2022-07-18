def score(*args):   # 외부함수
    print('score', args)
    def minmax():   # 내부함수
        min = -1
        max = -1
        for val in args:
            if min == -1 or val < min:
                min = val
            if max == -1 or val > max:
                max = val
        return min, max
    return minmax   # 내부함수를 리턴