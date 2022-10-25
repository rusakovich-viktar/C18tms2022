package main.java;

import java.io.Console;


public class Task1 {
	static String name = "";


	public static void main(String[] args) {
		String name;
		Console console = System.console();
		name = console.readLine("Пожалуйста, введите свое имя: ");
		System.out.println("Добро пожаловать, " + name);
	}
}

/*ой замонался я лечить ошибку кодировки русского языка*/