package com.gadai.menu;
import java.util.*;

import com.gadai.data.*;

public class PegadaianSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menuNumber;
		Scanner input = new Scanner(System.in);
		ArrayList<Inventory> newInventory = new ArrayList<>();
		int countID=0;

		int itemCount = newInventory.size();
		int id =0;
		double biaya=0;
		String name="";
		String product="";
		String description="";
		double price=0;
		int stringLength = 16;
		
//		Gadai data = new Gadai(countID, itemCount, id, biaya, name, product, description, price, stringLength);
		
		do {
			System.out.println("+-------------------------------+");
			System.out.println("      		MENU			");
			System.out.println("+-------------------------------+");
			System.out.println("1. Gadai");
			System.out.println("2. Tebus");
			System.out.println("3. Tampilkan Inventory");
			System.out.println("4. Exit");
			System.out.println("+-------------------------------+");
			System.out.print("Masukkan Menu Pilihan : ");
			menuNumber = input.nextInt();

			if(menuNumber==1) {
				Gadai gadai = new Gadai(newInventory, name, itemCount, product, description, price, stringLength);
				itemCount = gadai.getItemCount();
			} 
			else if(menuNumber==2) {
				Inventory.printHeaderTebus();
				for (Inventory inventory : newInventory) inventory.printRowTebus();
				Inventory.printLine();
				do {
					try {
						System.out.println("Masukkan ID barang yang ingin di tebus : ");	
						id = input.nextInt();
						if (id <= itemCount && id > 0) {
							do {
								try {
									System.out.println("Masukkan biaya yang ingin di tebus : ");	
									biaya = input.nextDouble();
								}
								catch (Exception e){
									input.next();
									continue;
								}
							} while(biaya > newInventory.get(id-1).getUtang() || biaya <= 0);

							if (biaya <= newInventory.get(id-1).getUtang()) {
								newInventory.get(id-1).setUtang(newInventory.get(id-1).getUtang() - biaya);
								if (newInventory.get(id-1).getUtang() == 0) {
									newInventory.get(id-1).setStatus("Lunas");
								}
							}
						}
					}
					catch (Exception e){
						input.next();
						continue;
					}
				} while(id > itemCount || id <= 0 );

			} else if(menuNumber==3) {
				Inventory.printHeaderInventory();
				for (Inventory inventory : newInventory) 
					if (inventory.getStatus() != "Lunas")
		        		inventory.printRowInventory();
				Inventory.printLine();
			} else if(menuNumber==4) {
				System.out.println("Exit");
			} else {
				System.out.println("Menu Tidak Ada");
			}
		} while(menuNumber!=4);

	}
}
