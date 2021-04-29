import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	  public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		  
		    System.out.print("Insira um número de 1 a 9\n");
		    int atvd = scan.nextInt();
			System.out.print("\n" + atvd + "º atividade: \n\n");
			
			if (atvd == 1 || atvd == 2) {
				Atv1.Atv1(args);
			}
			else if (atvd == 3) {
				Atv3.Atv3(args);
			}
			else if (atvd == 4) {
				Atv4.Atv4(args);
			}
			else if (atvd == 5) {
				Atv5.Atv5(args);
			}
			else if (atvd == 6) {
				Atv6.Atv6(args);
			}
			else if (atvd == 7) {
				Atv7 atv7 = new Atv7();
		        atv7.gerarGabarito();
		        System.out.println(atv7);
			}
			else if (atvd == 8) {
				Atv8.Atv8(args);
			}
			else if (atvd == 9) {
				Atv9.Atv9(args);
			}
			
			else {
				System.out.println("Número inválido");
				Main.main(args);
			}
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return;
	  }
	  


}
