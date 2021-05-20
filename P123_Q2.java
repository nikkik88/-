package hm.java.may;

import java.util.Scanner;

public class P123_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan; 
		
		while(true) {
			System.out.println("단:");
			dan = sc.nextInt();
			if(dan < 0) {
				System.out.println("끝");
				break;
			}
			
		for(int i = 0; i< 10; i++) {	
		System.out.println(dan + "*" + i + "=" + i * dan);
				
				}
			}

	}
}
