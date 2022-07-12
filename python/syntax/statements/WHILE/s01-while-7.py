count = 1
oddsum = 0
evensum = 0

while count <= 100:
    x = count - count // 2 * 2
    if x == 0:
        evensum += count
    else:
        oddsum += count
    count += 1

print('1부터 100까지의 짝수의 합은?', evensum)
print('1부터 100까지의 홀수의 합은?', oddsum)
