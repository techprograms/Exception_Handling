package com.test.exceptiondemo;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new java.io.FileReader("C:\\JAVA_PROJECTS\\ExceptionHandling\\src\\input.txt"));
			String wordline = br.readLine();
			while (wordline != null) {
				System.out.println(wordline);
				wordline = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
