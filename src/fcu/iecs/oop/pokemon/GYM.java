package fcu.iecs.oop.pokemon;

public class GYM {

	public static Player fight(Player... players) {
		int wincount1 = 0;
		int wincount2 = 0;
		int n;
		Pokemon[] p1 = players[0].getPokemons();
		Pokemon[] p2 = players[1].getPokemons();
		for (int i = 0; i < 3; i++) {
			if (p1[i].getType() == PokemonType.FIRE && p2[i].getType() == PokemonType.GRASS) {
				wincount1++;
			} else if (p2[i].getType() == PokemonType.FIRE && p1[i].getType() == PokemonType.GRASS) {
				wincount2++;
			} else if (p1[i].getType() == PokemonType.GRASS && p2[i].getType() == PokemonType.WATER) {
				wincount1++;
			} else if (p2[i].getType() == PokemonType.GRASS && p1[i].getType() == PokemonType.WATER) {
				wincount2++;
			} else if (p1[i].getType() == PokemonType.WATER && p2[i].getType() == PokemonType.FIRE) {
				wincount1++;
			} else if (p2[i].getType() == PokemonType.WATER && p1[i].getType() == PokemonType.FIRE) {
				wincount2++;
			} else if (p1[i].getType() == p2[i].getType()) {
				if (p1[i].getCp() == p2[i].getCp()) {
					n = (int) (Math.random() * 2) + 1;
					if (n == 1) {
						wincount1++;
					} else {
						wincount2++;
					}
				} else if (p1[i].getCp() > p2[i].getCp()) {
					wincount1++;
				} else {
					wincount2++;
				}
			}
			if (wincount1 >= 2 || wincount2 >= 2) {
				break;
			}
		}

//		System.out.printf("%d%n", wincount1);
//	System.out.printf("%d%n", wincount2);
		if (wincount1 >= 2) {
			int level1 = players[0].getLevel() + 1;
			players[0].setLevel(level1);
			System.out.printf("Winner is %s, and his/her level becomes %d.", players[0].getName(),
					players[0].getLevel());
			return players[0];
		} else {
			int level2 = players[1].getLevel() + 1;
			players[1].setLevel(level2);
			System.out.printf("Winner is %s, and his/her level becomes %d.", players[1].getName(),
					players[1].getLevel());
			return players[1];
		}

	}

}
