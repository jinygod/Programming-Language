package switchstmt;

public class SWstmt03 {

	public static void main(String[] args) {
		String cd = "031";
		String area = "모름";
		switch(cd) {
		case "02" : area = "서울"; break;
		case "031" : area = "경기"; break;
		case "041" : area = "대전"; break;
		case "051" : area = "부산"; break;
		}

		System.out.printf("지역코드(%s), 지역명(%s)\n",cd, area);
	}

}
