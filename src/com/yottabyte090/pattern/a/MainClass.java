package com.yottabyte090.pattern.a;

import java.util.Scanner;

public class MainClass {
	private static int loop;
	
	public static void main(String[] args) {
		String char1 = "1";
		String char2 = "0";
		String result = char1 + char2;
		
		getInput();
		
		if(loop == -1) {
			System.out.println("Something went wrong. (1)");
			System.exit(1);
		}
		
		for(int i=0; i<loop; i++) {
			String temp = result;
			for(int j=0; j<temp.length(); j++) {
				if(temp.substring(j, j + 1).equals(char1)) {
					result += char2;
				}else if(temp.substring(j, j + 1).equals(char2)){
					result += char1;
				}else {
					System.out.println("Something went wrong. (2)");
					System.exit(2);
				}
			}
		}
		
		System.out.println(result);
	}
	
	public static int getInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the number of times to repeat.\n반복할 횟수를 입력하십시오.");
		loop = scanner.nextInt();
		
		if(loop <= 0) {
			System.out.println("Wrong value. \n잘못된 값.");
			MainClass.getInput();
		}else {
			return loop;
		}
		return -1;
	}

}