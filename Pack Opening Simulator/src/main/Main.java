package main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type '1' to open a pack:");
		String packOrNot = scan.nextLine();
		List<String> rarities = new ArrayList<String>();
		if (packOrNot.equals("1") || packOrNot.toLowerCase().equals("one")) {
			System.out.println("Pack opening...");
			System.out.println("===================================");
			System.out.println("Congrats! You pulled a " + randomizeCard(rarities));
			
		}else if (packOrNot.equals("Test")){
			System.out.println(rarities);
		}else {
			System.out.println("Aww, maybe next time :(");
		}

	}
	
	
	public static String randomizeCard(List<String> rarities) {
		List<String> uncommon = Collections.nCopies(1185, "Uncommon");
		List<String> rare = Collections.nCopies(392, "Rare");
		List<String> superRare = Collections.nCopies(245, "Super Rare");
		List<String> ultraRare = Collections.nCopies(98, "Ultra Rare");
		List<String> secretRare = Collections.nCopies(40, "Secret Rare");
		
		addToList(uncommon, rarities);
		addToList(rare, rarities);
		addToList(superRare, rarities);
		addToList(ultraRare, rarities);
		addToList(secretRare, rarities);
		
		Collections.shuffle(rarities);
		String card = rarities.get(0);
		
		return card;
	}
	
	public static void addToList(List<String> rarity, List<String> rarities) {
		for (int i=0; i < rarity.size(); i++) {
			rarities.add(rarity.get(i));
		}
	}
		
}
