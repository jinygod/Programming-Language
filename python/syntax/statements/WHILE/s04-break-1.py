cnt = 1
tot = 0

while True:
    if cnt > 100:
        break

    tot += cnt
    print(f'cnt={cnt}, tot={tot}')
    cnt += 1

print('tot=', tot)