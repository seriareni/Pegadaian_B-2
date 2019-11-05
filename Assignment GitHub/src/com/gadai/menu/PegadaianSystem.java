package com.gadai.menu;
import java.util.*;

public class PegadaianSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menuNumber;
		Scanner input = new Scanner(System.in);

		System.out.println("+-------------------------------+");
		System.out.println("      		MENU			");
		System.out.println("+-------------------------------+");
		System.out.println("1. Gadai");
		System.out.println("2. Tebus");
		System.out.println("3. Tampilkan Inventory");
		System.out.println("4. Exit");
		System.out.println("+-------------------------------+");

		do {					
			System.out.print("Masukkan Menu Pilihan : ");
			menuNumber = input.nextInt();

			if(menuNumber==1) {
				System.out.println("Menu Gadai");
			} else if(menuNumber==2) {
				System.out.println("Menu Tebus");
			} else if(menuNumber==3) {
				System.out.println("Tampilkan Inventory");
			} else if(menuNumber==0) {
				System.out.println("Exit");
			} else {
				System.out.println("Menu Tidak Ada");
			}
		} while(menuNumber!=0);

	}
}


