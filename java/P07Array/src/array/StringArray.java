package array;

public class StringArray {

	public static void main(String[] args) {
		String[] s1 = { "홍길동", "김사랑", "이순신" };

		System.out.println("s1.length:" + s1.length);
		
		for(int index=0; index <s1.length; index++) {
			System.out.printf("[%d] %s%n",index, s1[index]);
		}

		for(String val : s1) {
			System.out.printf("[%s]%n",val);
		}
		
		for(int index = s1.length -1; index >=0; index--) {
			System.out.printf("[%d] %s%n",index, s1[index]);
				
		}
	}
}
	