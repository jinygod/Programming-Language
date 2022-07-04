[기본 클래스]

https://docs.oracle.com/javase/8/docs/api/

1. Object
	- 자바의 모든 클래스는 기본적으로 Object를 상속한다.
	
	- protected Object	clone()
	- boolean	equals(Object obj)
	- protected void	finalize()
	- Class<?>	getClass()
	- int	hashCode()
	- void	notify()
	- void	notifyAll()
	- String	toString()
	- void	wait()
	- void	wait(long timeout)
	- void	wait(long timeout, int nanos)
	
2. 얕은 복제
	- 참조형인 경우 주소만 복제되어 내용은 기존의 객체를 참조
	- 기존 객체를 공유하게되어 복제된 객체에서 수정하게 되면 원본 객체의 내용도 변경된다.
	
3. 깊은 복제
	- 참조형인 경우 새로 객체를 생성하여 데이터를 할당해야 한다.
	- 값이 복제가 되게 하기 위해서는
	   > 값을 담은 객체를 다시 생성(새로운 메모리를 준비)
	   > 새로운 메모리에 기존에 있는 값을 복사해야 한다.
	- 기본형은 값이 복제된다.
	
4. Wrapper Class(포장 클래스)
	- 기본 타입에 대응하는 클래스로서 각 기본 타입의 값을 가지고 있다.
	- 기본 타입의 값을 이용하여 추가적으로 유용한 기능을 제공
	- 기본 타입에 대응하는 객체 기능 제공
	- 기본 타입에 대응하는 레퍼런스 형을 요구하는 경우
	- 기본 타입은 포장 클래스에 비해 속도가 빠름
	- Byte(byte), Character(char), Short(short), Integer(int), Long(long)
	- Float(float), Double(double), Boolean(boolean)
	
