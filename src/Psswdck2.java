import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Psswdck2 {
	public static void main(String[] args) {
//		int[] pass1 = randpass(4);
//		int[] pass2 = randpass(8);
		crack(randpass(4));
		System.out.println();
		crack(randpass(8));
		
		
		
	}
	
	public static int[] randpass(int digits) {
		int[] pass = new int[digits];
		Random rand = new Random();
		String tehe = "";
		for (int i = 0; i < pass.length; i++) {
			pass[i] = rand.nextInt(10);
			tehe += pass[i] + "";
		}
		System.out.println(digits + " digit password is " + tehe);
		return pass;
	}
	

	
	public static void crack(int[] pass) {
		final long startTime = System.nanoTime();
		String found = "";
		int i = 0;
		while(i < pass.length) {
			for (int j = 0; j < 10; j++) {
				if (pass[i] == j) {
					System.out.println("Digit " + (i + 1) + " found");
					found += j + "";
					break;
				}
				if (found.length() == pass.length) {
					break;
				}
			}
			i++;
		}
		final long duration = (System.nanoTime() - startTime);
		System.out.println("Found pass is: " + found + " in " + duration + " seconds.");
	}
	
	public static void fourdigitcrack2(int[] pass) {
		String pwd = "";
		String guess = "";
		for (int i = 0; i < pass.length; i++) {
			pwd += pass[i] + "";
		}
		
		final long startTime = System.nanoTime();
		
		//0 - 9
		for (int i = 0; i < 10; i++) {
			guess = "000" + i + "";
			if (guess.equals(pwd)) {
				final long duration = (System.nanoTime() - startTime);
				System.out.println("Found pass is: " + guess + " in " + duration + " seconds.");
			}
		}
		
		// 10 - 99
		for (int i = 10; i < 100; i++) {
			guess = "00" + i + "";
			if (guess.equals(pwd)) {
				final long duration = (System.nanoTime() - startTime);
				System.out.println("Found pass is: " + guess + " in " + duration + " seconds.");
			}
		}
		
		// 100 - 999
		for (int i = 100; i < 1000;) {
			guess = "0" + i + "";
			if (guess.equals(pwd)) {
				final long duration = (System.nanoTime() - startTime);
				System.out.println("Found pass is: " + guess + " in " + duration + " seconds.");
			}
		}
		
		//1000 - 9999
		for (int i = 1000; i < 10000;) {
			guess = i + "";
			if (guess.equals(pwd)) {
				final long duration = (System.nanoTime() - startTime);
				System.out.println("Found pass is: " + guess + " in " + duration + " seconds.");
			}
		}
	}

}
