import java.util.Scanner;

public class Atv1 { //CALCULA 4 OPERAÇÕES COM OS 2 NUMEROS INSERIDOS
	
	@SuppressWarnings("resource")
	public static void Atv1(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Insira um número: ");
		double n1 = scan.nextDouble();
		System.out.print("Insira outro número: ");
		double n2 = scan.nextDouble();
		double soma = n1+n2;
		double subt = n1-n2;
		double divi = n1/n2;
		double mult = n1*n2;
		
		System.out.println("\n" + n1 + " + " + n2 + " = " + soma );
		System.out.println("\n" + n1 + " - " + n2 + " = " + subt );
		System.out.println("\n" + n1 + " / " + n2 + " = " + divi );
		System.out.println("\n" + n1 + " * " + n2 + " = " + mult );
	}

}
