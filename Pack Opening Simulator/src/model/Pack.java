package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pack {
	private String name;
	private boolean trainerGalleryOrNot;
	
	public String randomizeRarity(String packName) {
		List<String> rarities = new ArrayList<String>();
		switch (packName) {
		 case "Silver Tempest":
			
			List<String> noHit = Collections.nCopies(43154,  "Regular Rare");
			List<String> holo = Collections.nCopies(16800, "Holo");
			List<String> v = Collections.nCopies(8400, "V");
			List<String> vMax = Collections.nCopies(2800, "V Max");
			List<String> fullArtV = Collections.nCopies(1575, "Full Art V");
			List<String> rainbow = Collections.nCopies(945, "Rainbow Rare");
			List<String> fullArtTrainer = Collections.nCopies(756, "Full Art Trainer");
			List<String> gold = Collections.nCopies(720, "Gold");
			List<String> altArt = Collections.nCopies(450, "Alt Art");
			addToList(noHit, rarities);
			addToList(holo, rarities);
			addToList(v, rarities);
			addToList(vMax, rarities);
			addToList(fullArtV, rarities);
			addToList(rainbow, rarities);
			addToList(fullArtTrainer, rarities);
			addToList(gold, rarities);
			addToList(altArt, rarities);
			break;
			
		 case "Lost Origin":
			
			List<String> noHit1 = Collections.nCopies(2122515,  "Regular Rare");
			List<String> holo1 = Collections.nCopies(837200, "Holo");
			List<String> v1 = Collections.nCopies(418600, "V");
			List<String> vMax1 = Collections.nCopies(163800, "V Max");
			List<String> fullArtV1 = Collections.nCopies(75348, "Full Art V");
			List<String> rainbow1 = Collections.nCopies(48300, "Rainbow Rare");
			List<String> fullArtTrainer1 = Collections.nCopies(53820, "Full Art Trainer");
			List<String> gold1 = Collections.nCopies(28980, "Gold");
			List<String> altArt1 = Collections.nCopies(18837, "Alt Art");
			addToList(noHit1, rarities);
			addToList(holo1, rarities);
			addToList(v1, rarities);
			addToList(vMax1, rarities);
			addToList(fullArtV1, rarities);
			addToList(rainbow1, rarities);
			addToList(fullArtTrainer1, rarities);
			addToList(gold1, rarities);
			addToList(altArt1, rarities);
			break;
			
		}
		
		Collections.shuffle(rarities);
		String rarity = rarities.get(0);
		return rarity;
		
	}
	
	public String randomizeCard(String rarity) {
		String card = "";
		List<String> names = new ArrayList<String>();
		String name = getName();
		switch (name) {
		case "Silver Tempest":
			switch (rarity) {
			 case "Regular Rare":
				names.add("Rare Amoonguss");
				names.add("Rare Arcanine");
				names.add("Rare Archeops");
				names.add("Rare Armaldo");
				names.add("Rare Cobalion");
				names.add("Rare Delphox");
				names.add("Rare Froslass");
				names.add("Rare Gardevoir");
				names.add("Rare Hisuian Braviary");
				names.add("Rare Incineroar");
				names.add("Rare Keldeo");
				names.add("Rare Klinklang");
				names.add("Rare Milotic");
				names.add("Rare Mismagius");
				names.add("Rare Noivern");
				names.add("Rare Phione");
				names.add("Rare Talonflame");
				names.add("Rare Victini");
				names.add("Rare Virizion");
				names.add("Rare Zeraora");
				names.add("Rare Zygarde");
				break;
			 case "Holo":
				names.add("Holo Ariados");
				names.add("Holo Articuno");
				names.add("Holo Crobat");
				names.add("Holo Dragapult");
				names.add("Holo Dragonite");
				names.add("Holo Earthen Seal Stone");
				names.add("Holo Forest Seal Stone");
				names.add("Holo Krookodile");
				names.add("Holo Medicham");
				names.add("Holo Metagross");
				names.add("Holo Rapidash");
				names.add("Holo Reniculus");
				names.add("Holo Terrakion");
				break;
			 case "V":
				names.add("Serperior V");
				names.add("Chesnaught V");
				names.add("Reshiram V");
				names.add("Alolan Vulpix V");
				names.add("Omastar V");
				names.add("Regieleki V");
				names.add("Unown V");
				names.add("Mawile V");
				names.add("Hisuian Arcanine V");
				names.add("Ursaluna V");
				names.add("Skunktank V");
				names.add("Magearna V");
				names.add("Regidrago V");
				names.add("Lugia V");
				names.add("Ho-Oh V");
				break;
			 case "V Max":
				names.add("Serperior Vstar");
				names.add("Alolan Vulpix Vstar");
				names.add("Regileki Vmax");
				names.add("Unown Vstar");
				names.add("Mawile Vstar");
				names.add("Regidrago Vstar");
				names.add("Lugia Vstar");
				break;
			 case "Full Art V":
				names.add("Full Art Serperior V");
				names.add("Full Art Chesnaught V");
				names.add("Full Art Reshiram V");
				names.add("Full Art Alolan Vulpix V");
				names.add("Full Art Omastar V");
				names.add("Full Art Regieleki V");
				names.add("Full Art Unown V");
				names.add("Full Art Mawile V");
				names.add("Full Art Hisuian Arcanine V");
				names.add("Full Art Skunktank V");
				names.add("Full Art Magaerna V");
				names.add("Full Art Regidrago V");
				names.add("Full Art Lugia V");
				names.add("Full Art Ho-Oh V");
				break;
			 case "Rainbow Rare":
				names.add("Rainbow Serperior Vstar");
				names.add("Rainbow Alolan Vulpix Vstar");
				names.add("Rainbow Regieleki Vmax");
				names.add("Rainbow Unown Vstar");
				names.add("Rainbow Mawile Vstar");
				names.add("Rainbow Regidrago Vstar");
				names.add("Rainbow Lugia Vstar");
				names.add("Rainbow Brandon Trainer");
				names.add("Rainbow Candice Trainer");
				names.add("Rainbow Furisode Girl Trainer");
				names.add("Rainbow Lance Trainer");
				names.add("Rainbow Serena Trainer");
				names.add("Rainbow Wallace Trainer");
				names.add("Rainbow Worker Trainer");
				break;
			 case "Full Art Trainer":
				names.add("Candice Trainer");
				names.add("Furisode Girl Trainer");
				names.add("Gym Trainer Trainer");
				names.add("Lance Trainer");
				names.add("Serena Trainer");
				names.add("Wallace Trainer");
				names.add("Worker Trainer");
				break;
			 case "Gold":
				names.add("Gold Serperior Vstar");
				names.add("Gold Lugia Vstar");
				names.add("Gold Energy Switch");
				names.add("Gold Gapejaw Bog");
				names.add("Gold Leafy Camo Poncho");
				names.add("Gold V Guard Energy");
				break;
		 	 case "Alt Art":
				names.add("**Alt ArtUnown V**");
				names.add("**Alt ArtSkunktank V**");
				names.add("**Alt ArtRegidrago V**");
				names.add("**Alt Art Lugia V**");
				break;
			}
		 case "Lost Origin":
			switch (rarity) {
			 case "Regular Rare":
				names.add("Rare Ariados");
				names.add("Rare Banette");
				names.add("Rare Bouffalant");
				names.add("Rare Clefable");
				names.add("Rare Comfey");
				names.add("Rare Cramorant");
				names.add("Rare Dewgong");
				names.add("Rare Dustox");
				names.add("Rare Elektross");
				names.add("Rare Gliscor");
				names.add("Rare Greedent");
				names.add("Rare Honchcrow");
				names.add("Rare Hoopa");
				names.add("Rare Landorus");
				names.add("Rare Magcargo");
				names.add("Rare Magearna");
				names.add("Rare Malamar");
				names.add("Rare Manectric");
				names.add("Rare Mimikyu");
				names.add("Rare Parasect");
				names.add("Rare Politoed");
				names.add("Rare Poliwrath");
				names.add("Rare Porygon-Z");
				names.add("Rare Raichu");
				names.add("Rare Rhyperior");
				names.add("Rare Spiritomb");
				names.add("Rare Stonjourner");
				break;
			 case "Holo":
				names.add("Holo Barbarcle");
				names.add("Holo Beautifly");
				names.add("Holo Chandelure");
				names.add("Holo Cresselia");
				names.add("Holo Darkrai");
				names.add("Holo Gengar");
				names.add("Holo Glastrier");
				names.add("Holo Hisuian Arcanine");
				names.add("Holo Hisuian Basculegion");
				names.add("Holo Hisuian Goodra");
				names.add("Holo Hisuian Zoroark");
				names.add("Holo Kingdra");
				names.add("Holo Machamp");
				names.add("Holo Orbeetle");
				names.add("Holo Pyroar");
				names.add("Holo Sableye");
				names.add("Holo Shiftry");
				names.add("Holo Snorlax");
				names.add("Holo Spectrier");
				names.add("Holo Trevenant");
				names.add("Holo Vileplume");
				names.add("Holo Volo");
				break;
			 case "V":
				names.add("Delphox V");
				names.add("Kyurem V");
				names.add("Magnezone V");
				names.add("Rotom V");
				names.add("Enamorus V");
				names.add("Aerodactyl V");
				names.add("Drapion V");
				names.add("Galarian Perrserker V");
				names.add("Giratina V");
				names.add("Hisuian Goodra V");
				names.add("Pidgeot V");
				names.add("Hisuian Zoroark V");
				break;
			 case "V Max":
				names.add("Kyurem Vmax");
				names.add("Magnezone Vstar");
				names.add("Aerodactal Vstar");
				names.add("Drapion Vstar");
				names.add("Giratina Vstar");
				names.add("Hisuian Goodra Vstar");
				names.add("Hisuian Zoroark Vstar");
				break;
			 case "Full Art V":
				names.add("Full Art Hisuian Electrode V");
				names.add("Full Art Delphox V");
				names.add("Full Art Kyurem V");
				names.add("Full Art Magnezone V");
				names.add("Full Art Rotom V");
				names.add("Full Art Enamorus V");
				names.add("Full Art Aerodactyl V");
				names.add("Full Art Gallade V");
				names.add("Full Art Drapion V");
				names.add("Full Art Galarian Perrserker V");
				names.add("Full Art Giratina V");
				names.add("Full Art Hisuian Goodra V");
				names.add("Full Art Pidgeot V");
				break;
			 case "Rainbow Rare":
				names.add("Rainbow Kyurem Vmax");
				names.add("Rainbow Magnezone Vstar");
				names.add("Rainbow Aerodactyl Vstar");
				names.add("Rainbow Drapion Vstar");
				names.add("Rainbow Giratina Vstar");
				names.add("Rainbow Hisuian Goodra Vstar");
				names.add("Rainbow Hisuian Zoroark Vstar");
				names.add("Rainbow Arezu");
				names.add("Rainbow Colress's Experiment");
				names.add("Rainbow Fantina");
				names.add("Rainbow Iscan");
				names.add("Rainbow Lady");
				names.add("Rainbow Miss Fortune Sisters");
				names.add("Rainbow Thorton");
				names.add("Rainbow Volo");
				break;
			 case "Full Art Trainer":
				names.add("Arezu");
				names.add("Colress's Experiment");
				names.add("Fantina");
				names.add("Iscan");
				names.add("Lady");
				names.add("Miss Fortune Sisters");
				names.add("Thorton");
				names.add("Volo");
				break;
			 case "Gold":
				names.add("Gold Giratina Vstar");
				names.add("Gold Hisuian Zoroark Vstar");
				names.add("Gold Box of Disaster");
				names.add("Gold Collapsed Stadium");
				names.add("Gold Dark Patch");
				names.add("Gold Lost Vacuum");
				break;
			 case "Alt Art":
				names.add("**Alt Art Rotom V**");
				names.add("**Alt Art Aerodactyl V**");
				names.add("**Alt Art Galarian Perrserker V**");
				names.add("**Alt Art Giratina V**");
				break;
			}
		}
		
		Collections.shuffle(names);
		card = names.get(0);
		return card;
	}
	
	public static void addToList(List<String> rarity, List<String> rarities) {
		for (int i=0; i < rarity.size(); i++) {
			rarities.add(rarity.get(i));
		}
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTrainerGalleryOrNot() {
		return trainerGalleryOrNot;
	}

	public void setTrainerGalleryOrNot(boolean trainerGalleryOrNot) {
		this.trainerGalleryOrNot = trainerGalleryOrNot;
	}
}
