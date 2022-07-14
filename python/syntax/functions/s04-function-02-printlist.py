# 함수
# 가변인자: 함수의 입력값이 몇개일지 모를 때, 0개 이상
# 함수인자 앞에 아스터리스크(*)를 넣음
# 인자는 튜플(Tuple)로 전달

# 입력받은 인자의 모든 값을 더하는 함수
# 자료형별로 특성에 맞게 출력
def printlist(title, *args):
    print(f"[{title} type({type(args)})")

    for px in args:
        print(f"[{px}] type({type(px)})")
        if isinstance(px, dict):
            print("<dict>")
            ks = list(px.keys())
            for k in ks:
                print(f"key[{k}], value[{px[k]}]")
            print("-" * 50)
            dl = list(px.items())
            for item in dl:
                print(f"key[{item[0]}], value[{item[1]}]")
        elif isinstance(px, list):
            print("<list>")
            for v in px:
                print(f"value[{v}]")
        elif isinstance(px, set):
            print("<set>")
            for v in px:
                print(f"value[{v}]")
        elif isinstance(px, tuple):
            print("<tuple>")
            for v in px:
                print(f"value[{v}]")
        else:
            print("<etc>")
            print(f"value[{px}]")
        

# 가변인자로 다양한 자료형을 전달하여 내용을 출력
printlist("리스트, 튜플", [1,3,5,7,9], (2,4,6,8,10))
# printlist("기본", 1,2,3,4)
# printlist("리스트", [1,3,5,7,9])
# printlist("딕셔너리", {1:"one", 3:"three", 5:"five"})
# printlist("튜플", (2,4,6,8,10))
# printlist("셋", {10,20,30,40,50})