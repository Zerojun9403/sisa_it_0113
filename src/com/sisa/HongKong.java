package com.sisa;

/*
 * HongKong 클래스
 * - MenuPan 인터페이스를 구현한 구현 클래스
 * - 인터페이스에 선언된 모든 추상 메서드를 반드시 구현해야 함
 */
public class HongKong implements MenuPan { 
    // implements : 인터페이스의 구현 약속
    

    /*
     * menu1()
     * - MenuPan 인터페이스에 선언된 메서드
     * - 메뉴판 전체를 출력하는 기능
     */
  
    public void menu1() {
        System.out.println("메뉴판 출력");
    }

    /*
     * jjamppong()
     * - MenuPan 인터페이스에 선언된 메서드
     * - 짬뽕 메뉴 출력
     */
    public void jjamppong() {
        System.out.println("짬뽕");
        초밥();
    }

    /*
     * bokkeumbap()
     * - MenuPan 인터페이스에 선언된 메서드
     * - 볶음밥 메뉴 출력
     */
 
    public void bokkeumbap() {
        System.out.println("볶음밥");
    }
    
    
    private void 초밥() {
    	System.out.println("한입에쏙");
    }
}
