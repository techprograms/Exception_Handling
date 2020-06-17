package com.test.exceptiondemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\JAVA_PROJECTS\\ExceptionHandling\\src\\input.txt"))) {
			String wordline = br.readLine();
			while (wordline != null) {
				System.out.println(wordline);
				wordline = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
