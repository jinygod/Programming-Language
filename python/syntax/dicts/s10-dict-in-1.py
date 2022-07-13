# 딕셔너리
# 딕셔너리 안에 키가 있는지 조사하여 결과를 bool로 리턴
# bool = key in dict

nums = {}

nums['홀수'] = [1,3,5] # 리스트값
nums['짝수'] = [2,4,6] # 리스트값
nums['숫자'] = (1,2,3) # 튜플값
print(nums)

exist = '짝수' in nums
print('짝수:' , exist)

odd = '홀수'
exist = odd in nums
print(odd, ':', exist)

print('문자 :', '문자' in nums)