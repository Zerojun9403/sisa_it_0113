package com.sisa;

/*
 * InterfaceTest 클래스
 * - 인터페이스(MenuPan)를 이용한 다형성 테스트 클래스
 * - main() 메서드를 포함한 실행 클래스
 */
public class InterfaceTest {

    public static void main(String[] args) {

        /*
         * MenuPan 타입의 참조변수 menu 선언
         * HongKong 객체를 생성하여 참조
         * → 인터페이스 타입으로 구현 객체를 참조하는 다형성 구조
         */
        MenuPan menu = new HongKong();

        /*
         * 인터페이스에 선언된 메서드 호출
         * 실제 실행되는 메서드는 HongKong 클래스의 구현 메서드
         * (동적 바인딩)
         */
        menu.menu1();      // 메뉴판 출력
        menu.jjamppong();  // 짬뽕 출력
        menu.bokkeumbap(); // 볶음밥 출력

    }

}
