# ���ͳݿ��� ���� ��������
# ����꿡�� titanic �ڷ� ��������

titanic <- read.csv("https://vincentarelbundock.github.io/Rdatasets/csv/COUNT/titanic.csv")
titanic
str(titanic)
dim(titanic) # 1316 * 5
table(titanic$age)
table(titanic$sex)
table(titanic$survived)

head(titanic)
tail(titanic)

# ��������ǥ �ۼ�
# ������ ���� ���� ����
tab <- table(titanic$survived, titanic$sex)
tab

# ���� ��Ʈ �׸���
barplot(tab, col=rainbow(2), main="������ ���� ���� ����")