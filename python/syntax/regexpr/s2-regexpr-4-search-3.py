# 정규 표현식(Regular Expressions)
# 정규 표현식에 사용하는 모듈

# match(), search() 객체의 메서드
# group() : 매치된 문자열
# start() : 매치된 문자열의 시작 위치
# end() : 매치된 문자열의 끝 위치
# span() : 매치된 문자열의 (시작, 끝)에 해당하는 튜플(tuple)
import re
p = re.compile('[a-z]+')    # 반드시 알파벳으로 시작
m = p.search('python is easy!!!')
if m:
    print('> search found:')
    print(' > group:', m.group())
    print(' > start:', m.start())
    print(' >   end:', m.end())
    print(' >  span:', m.span(), type(m.span()))
else:
    print('No search')