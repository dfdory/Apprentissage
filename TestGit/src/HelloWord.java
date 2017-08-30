import java.util.Scanner;

public class HelloWord {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour dodo tu vas y trouver . vasy");
		/* Debut Lecture et ecriture au clavier */
		System.out.println("entrez un nbre");
		sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("entrez une chaine");
		sc.nextLine(); // insctruction permettant de vider la chaine
		String x = sc.nextLine();

		System.out.println("FIN : " + i + " : " + x);
		char carac = x.charAt(0);
		System.out.println("le premier caractere  de la chaine est : " + carac);

		/* Fin Lecture et ecriture au clavier */

	}

}
