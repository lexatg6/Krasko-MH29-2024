package vezbe_2;

import java.util.Scanner;

public class Explorers_game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pozdrav burke");
		System.out.println("Kako se zoves:");
		String name = scanner.next();
		System.out.println(name + ", gde hoces da ides");
		String destination = scanner.next();
		
		Explorer explorer = new Explorer(name, destination);
		while(explorer.isAlive()) {
			explorer.explore();
		
		
		if(!explorer.isAlive()) {
			System.out.println("Umro si");
			explorer.explorerDied();
			continue;
		}
		if(explorer.getKnowledge()>=100) {
			System.out.println("Bravo, imas dosta srece");
			break;
			
		}
		System.out.println("Posle " + explorer.getTurn() + " dana imas sledece statove");
		System.out.println("Supplies" + explorer.getSupplies());
		System.out.println("Knowledge" + explorer.getKnowledge());
		System.out.println("Ako hoces da nastavis, pritisni 1.");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			continue;
		}else {
			break;
		}
		
		
		
	}
	System.out.println("Tvoj rezultat je" + explorer.getKnowledge());
	scanner.close();
	}
}


