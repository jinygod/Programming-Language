# 반복문(while)
# 예금을 에치하여 복리이자 계산
# 원금 10만원, 이자가 연 10%, 만기 10년, 복리로 계산하라.

interest = 0.1
last = 10
total = 100000
cnt = 1

while cnt <= last:
    cost = total * interest # 이자
    total += cost
    print(f"[cnt={cnt}] cost={cost}, total={total}")
    cnt += 1

print(f">>> total={total}")