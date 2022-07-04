package students;

public class SchoolMain {
	
	/*
	 * 변수선언:
	 * 	자료형 변수형 = 값
	 * int x1 = 10;
	 * ----------------------------------------------------------
	 * 객체선언:
	 * 	클래스이름(사용자 자료형) 변수명 = new 클래스이름(파라미터)
	 * School s1 = new School(...);
	 * -----------------------------------------------------------
	 * 생성자를 하나라도 만들면 기본생성자는 자동으로 만들어 주지 않는다.
	 * 그러므로 기본생성자가 필요하면 수동으로 만들어야 한다.
	 * ex) public School() {
	 * }
	 * -----------------------------------------------------------
	 * 기본생성자: 파라미터가 없는 생성자
	 */

public static void main(String[] args) {
		School school1 = new School(2022042701, "서울고", 1958, "서울", "02");
		School school2 = new School(2022042702, "경기고", 1961, "경기", "031");
		School school3 = new School(2022042704, "울산고", 1993, "울산", "052");
		School school4 = new School();
		schoolInfo(school1);
		schoolInfo(school2);
		schoolInfo(school3);

		// setter를 통해서 객체의 속성에 값을 저장할 수 있다.
		school4.setCode(2012);
		school4.setName("부산고");
		school4.setYear(2011);
		school4.setAddress("모란");
		school4.setTel("051");
		schoolInfo(school4);
		
	}
static void schoolInfo(School school) {
		
		// 접근제한: private해제해야 함
		// 정식통로를 통해 들어가야함 .getcode()
		
		// getter(값을 얻음,참조)를 통해서 객체에 접근할 수 있다.
		System.out.println("-----[학교정보]-----");
		System.out.println("\t code: " + school.getCode());
		System.out.println("\t name: " + school.getName());
		System.out.println("\t year: " + school.getYear());
		System.out.println("\t address: " + school.getAddress());
		System.out.println("\t tel: " + school.getTel());
		
		

	}
}