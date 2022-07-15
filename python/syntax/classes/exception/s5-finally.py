# 예외 처리
# try ~ finally
# 예외에 관계없이 함수 수행

filename = 'F:/workspace/python/syntax/s5-test.txt'
# filewriter = open(filename, 'w')
filelen = 0
filewriter = None

try:
    filewriter = open(filename, 'w')
    filelen = filewriter.write("filename is s5-test.txt\n")
except FileNotFoundError as e:
    print('파일생성오류', e)
finally:
    print('finally 실행')
    if filewriter != None:
        filewriter.close()

print('파일 {0}을 성공적으로 생성하여 크기{1}의 내용을 저장했습니다.'.format(filename, filelen))

# 파일 속성이 읽기전용이면 'w'모드로 파일을 오픈하면 나오는 에러
# PermissionError: [Errno 13] Permission denied:
