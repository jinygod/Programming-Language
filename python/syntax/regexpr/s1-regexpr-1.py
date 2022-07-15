# 정규 표현식(Regular Expressions)

# 정규 표현식을 왜 필요로 한가?

data = """park 800905-1049118
kim 700905-1059119"""

result = []

for line in data.split("\n"):
    word_result = []
    for word in line.split(' '): # 공백문자로 나누기
        if len(word) == 14 and word[:6].isdigit() and word[7:].isdigit():
            word = word[:6] + '-' + '*******'
        word_result.append(word)
        print('word=', word)
    result.append(' '.join(word_result))

print("result:", result)
print('\n'.join(result))

print("-" * 50)
for rl in result:
    print(rl)