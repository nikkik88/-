package hm.java.may;

import java.util.Scanner;

public class P123_Q3 {

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
			
			for(int i = 1; i<= dan; i++) {	
		System.out.println(i + "*" + dan + "=" + i * dan);

		}
		}
	}

}
