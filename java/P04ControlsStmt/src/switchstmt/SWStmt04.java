package switchstmt;

public class SWStmt04 {

	public static void main(String[] args) {
		float sw = 1.0f;
		float result = 0.0f;
	
		/*
		switch((int)sw) {
		case 1.0f: result = sw * 1.0f; break;
		case 2.0f: result = sw * 2.0f; break;
		case 3.0f: result = sw * 3.0f; break;
		}
		*/
		switch((int)sw) {
		case 1: result = sw * 1.0f; break;
		case 2: result = sw * 2.0f; break;
		case 3: result = sw * 3.0f; break;
		}
		System.out.println("result: " + result);
	}

}
