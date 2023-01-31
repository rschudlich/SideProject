package main;
import java.util.List;
import java.util.Scanner;

import model.Pack;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which pack would you like to open?");
		System.out.println("Type 1 for Silver Tempest");
		System.out.println("Type 2 for Lost Origin");
		int packType; 
		while (true)
			try {
				packType = Integer.parseInt(scan.nextLine());
				break;
			}catch (NumberFormatException nfe) {
				System.out.println("Please try a valid number");
				System.out.println("===================================");
				System.out.println("Which pack would you like to open?");
				System.out.println("Type 1 for Silver Tempest");
				System.out.println("Type 2 for Lost Origin");
			}
		Pack currentPack = new Pack();
		
		String packName = "";
		switch (packType) {
		case 1: 
			packName = "Silver Tempest";
			break;
		case 2:
			packName = "Lost Origin";
			break;
		}
		
		currentPack.setName(packName);
		System.out.println(currentPack.getName());
		
		if (packType > 0 && packType <= 2) {
			System.out.println("How many packs would you like to open?");
			int pack1Amount = 0;
			while (true) 
				try {
					pack1Amount = Integer.parseInt(scan.nextLine());
					break;
				}catch (NumberFormatException nfe) {
					System.out.println("Please try a valid number");
					System.out.println("===================================");
					System.out.println("How many packs would you like to open?");
				}
			
			int count = 1;
			for (int i=0; i < pack1Amount; i++) {
				String rarity = currentPack.randomizeRarity(packName);
				System.out.println("Pack number " + count + " opening...");
				System.out.println("Congrats! You pulled a " + currentPack.randomizeCard(rarity));
				if (packName.contentEquals("Silver Tempest")) {
					Thread.sleep(250);
				}
				System.out.println("===================================");
				count++;
			}
	
		}else {
			System.out.println("Uh Oh, something went wrong. It looks like you may have entered the wrong pack value.");
		}
		
		scan.close();	
		
	}
	
	public static void addToList(List<String> rarity, List<String> rarities) {
		for (int i=0; i < rarity.size(); i++) {
			rarities.add(rarity.get(i));
		}
	}
		
}
