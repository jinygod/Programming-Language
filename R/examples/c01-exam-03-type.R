# [자료형]
# 숫자형(Numeric) : 1234, 0, -1234
# 문자형(String) : "a", "abcd"
# 논리형(Logical) : TRUE, FALSE, T, F
# 결측 데이터 : NA(Not Available), NaN(Not a Number)

int <- 20
int

string <- '홍길동'
string

# 논리형
boolean <- TRUE
boolean
false <- FALSE
false
t <- T # 참
t

f <- F # 거짓
f

# 합계를 구하는 함수
sum(10, 20, 30) # 결과: 60

# NA가 포함되어 있으면 계산되지 않음
sum(10, 20, 30, NA) # 결과: NA

# NA 제거 후 계산
sum(10, 20, 30, NA, na.rm=TRUE) # 결과: 60

# 현재 사용중인 변수 보기
ls()

# 자료형 확인 : 결과는 TRUE, FALSE
is.character(string)
is.character(name)
is.character(age) # TRUE

age <- 35
is.numeric(age) # TRUE
age <- '홍길동'
is.numeric(age) # FALSE

# 정수형으로 명시적으로 형변환을 해야 한다.
age <- 12
is.integer(age)

# x가 integer이기 때문에 y도 integer
x <- as.integer(12)
is.double(x)
is.integer(x)

# 10은 숫자이지만 정수로 인식하지 않음
# 정수형으로 하기 위해서는 as.integer()로 형변환을 해야 한다.
z = 10
is.numeric(z)
is.integer(as.integer(z))

# 백터 변수(1차원) : 배열
names <- c("홍길동", "이순신", "전우치")
names

ages <- c(10, 20, 30)
ages

# 문자형이 섞여 있으면 모든 요소를 문자형으로 변환
nstrs <- c(1, 2, "abc")
nstrs

# 자료형의 구조 확인
# mode()
mode(int)
mode(age)
mode(z)
mode(t)

class(int)
class(age)
class(t)

# 날짜형
now <- "2022/07/04"
now
class(now)
dt <- as.Date(now, '%y/%m/%d') # %y : 년도 2자리
dt # "2022-07-04"
class(dt)

now <- "2022/07/05"
now
class(now)
dt <- as.Date(now, '%Y/%m/%d') # %y : 년도 4자리
dt # "2022-07-04"
class(dt)

# 시분초
now <- "2022/07/05 14:35:10"
now
class(now)
today <- strptime(now, format='%Y/%m/%d %H:%M:%S') # %y : 년도 4자리, 시간
class(today)
today

# 시스템의 현재시간
# Sys.time
now <- Sys.time()
now
class(now)
today <- strptime(now, format='%Y-%m-%d %H:%M:%S') # %y : 년도 4자리, 시간
class(today)
today
