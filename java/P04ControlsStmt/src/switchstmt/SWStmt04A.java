package switchstmt;

public class SWStmt04A {

	public static void main(String[] args) {
		float sw = 0.12345678f;
		float result = 0.0f;

		if (sw == 0.12345678f) {
			result = sw * 5.0f;
		}
		if (sw == 1.0f) {
			result = sw * 1.0f;
		}
		else if (sw == 2.0f) {
			result = sw * 2.0f;
		}
		else if (sw == 3.0f) {
			result = sw * 3.0f;
		}
		System.out.println("result: " + result);
	}

}