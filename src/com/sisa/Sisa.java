package com.sisa;

public interface Sisa {
	void it();

	default void cook() {
		System.out.println("아름다운 요리");
	}

	static void foreignLanguage() {
		System.out.println("외국어필수");
	}
}

class SisaImpl implements Sisa {
	@Override
	public void it() {
		System.out.println("Ai아카데미");
	}

	@Override
	public void cook() {
		System.out.println("한식");
	}

	// @Override -> static 은 오버라이드 불가능
	public void foreignLanguage() {
		System.out.println("곤니치와");
	}
}