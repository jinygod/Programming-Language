# �ݺ���
# for(���� in ����) { ���๮ } 

# java: for(int n : i){}

# ����(i) ���� 1���� 10����
# i���� ���� �ϳ��� ������ n�� ����
# ����(i)�� ������ŭ �ݺ�
i <- c(1:10)
for(n in i){
  cat('n=',n, ", n * 10 =", n * 10, "\n")
}

# Ȧ���� ��
sn <- 0
for(n in seq(1,10,2)){
  sn = sn + n
  cat('n=',n, ", sum = ", sn,  "\n")
}

# ¦���� ��
sn <- 0
for(n in seq(2,10,2)){
  sn = sn + n
  cat('n=',n, ", sum = ", sn,  "\n")
}