package com.sisa;

class A{
	
	// 다형성
	// A클래스의 draw()메서드는 변경하지 않는다!
	static void draw(Shape s) {
		s.draw();
	}
}

public class AbstractTest {
	public static void main(String[] args) {
		
		A.draw(new Rectagle());
		A.draw(new Circle());
	}

}
