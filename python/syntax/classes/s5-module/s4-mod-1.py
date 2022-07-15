# from 모듈이름 import 모듈함수
# import 할 때 모듈 mod2에 있는 테스트 코드가 실행되어 출력된다.

# from 모듈이름 import 모듈함수 as 별칭
import mod4 as mod

print('PI=', mod.PI)

print(mod.add(1,3))
print(mod.sub(3,2))

# 반지름이 7인 원의 넓이는?
msg = '반지름이 7인 원의 넓이는?'
area = mod.Math()
print(msg, area.solv(7))