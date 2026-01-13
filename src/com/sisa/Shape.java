package com.sisa;

//public class Shape {

public abstract class Shape{
	/*
	 	자바 추상(특징) 클래스 : 자식 클래스를 제어하는 클래스! 
	 	                         자식들의 공통적인 선언한느 클래스 
	 */
	
	
	// 구현메서드
	public void food() {
		System.out.println("음식제공!");
	}
	
	// 선언메서드
	 abstract void draw();
	// 추상클래스는 정의된 메서드와 선언된 메서드를 함께 정의할수 있으므로
	// 추가된 선언된 메서드를 사용하려면 먼저 abstract선언을 필수적으로 해야함
}
