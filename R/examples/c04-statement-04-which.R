# which() �Լ�
# Ư�� �����͸� �˻�
# ���ǽĿ� �����ϴ� ����� ���� ������ ��ġ�� ����

odd <- c(1,3,5,7,9)
x <- which(odd == 7)
cat("���Ͱ�:", odd)
cat("�ε���:", x) # ���� odd���� �� 7�� ��ġ�� �ε�����? 4

# ������������
no <- c(1:5)
name <- c("ȫ","��","��","��","��")
score <- c(60,70,80,90,100)
exam <- data.frame(�й�=no,�̸�=name,����=score)
exam

ryu <- which(exam$�̸� == "��")
ryu
exam[ryu,]

# ������ Į���� ���
exam.name <- c(names(exam))
exam.name
 for(n in exam){
   print(n)
 }

# while() �Լ�
# while(���ǹ�){}
# ���ǹ��� ���̸� ������ ��� ����
i <- 0
while(i < 10){
  i <- i + 1
  print(i)
}