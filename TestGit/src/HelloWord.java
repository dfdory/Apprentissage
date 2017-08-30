import java.util.Scanner;

public class HelloWord {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour dodo tu vas y trouver . vasy");
		/* Debut Lecture et ecriture au clavier */
		/*
		 * System.out.println("entrez un nbre"); sc = new Scanner(System.in);
		 * int i = sc.nextInt(); System.out.println("entrez une chaine");
		 * sc.nextLine(); String x = sc.nextLine();
		 * 
		 * System.out.println("FIN : " + i + " : " + x); char carac =
		 * x.charAt(0);
		 * System.out.println("le premier caractere  de la chaine est : " +
		 * carac);
		 */
		/* Fin Lecture et ecriture au clavier */

		/* Boucles et conditions */
		int note = 30;
		switch (note) {
		case 0:
			System.out.println("Ouch !");
			break;
		case 10:
			System.out.println("Vous avez juste la moyenne");
			break;
		case 20:
			System.out.println("Parfait");
			break;

		default:
			System.out.println("il faut davantage travailler");
		}

		int x = 10, y = 20;

		int max = (x < y) ? (y < 10) ? y % 10 : y * 2 : x; // Max vaut 40

		// Pas très facile à lire…
		// Vous pouvez entourer votre deuxième instruction ternaire par des
		// parenthèses pour mieux voir :

		max = (x < y) ? ((y < 10) ? y % 10 : y * 2) : x; // Max vaut 40
		System.out.println("la valeur de max est : " + max);

		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O') {
			System.out.println("Donnez un prenom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment tu vas? ");
			reponse = ' ';
			while (reponse != 'O' && reponse != 'N') {
				System.out.println("Voulez vous reessayer? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}

		}
		System.out.println("Au revoir....");
		int a = 1, b = 15;
		while (++a < b) {
			System.out.println("coucou " + a + " fois !!");
			// a++;
		}
	}

}
