package com.kh.git;

import com.kh.git.animal.Cat;
import com.kh.git.animal.Dog;

public class HelloGit {

	public static void main(String[] args) {
		System.out.println("HelloGit!!!");
		
		// Dog 기능추가
		Dog dog = new Dog();
		dog.bark();
		
		// Cat 기능 추가
		Cat cat = new Cat();
		cat.miao();
	}
}
