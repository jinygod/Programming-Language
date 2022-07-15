# 예외 처리

filename = "README.txt"
file = open(filename, 'r')

# 결과는?
# FileNotFoundError
# [Errno 2] No such file or directory: '없는파일'
