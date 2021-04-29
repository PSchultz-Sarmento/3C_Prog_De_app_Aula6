import java.util.Arrays;
import java.util.Scanner;

public class Atv6 {
	
	@SuppressWarnings("resource")
	public static void Atv6(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] lista1 = {0,0,0,0,0,0,0,0,0,0}; //DEFINE UM ARRAY VAZIO
		int x = 0;
		int y = 0;
		int menores = 0;
		
		while (x < lista1.length) { // PEDE 10 VALORES
			System.out.println("Insira um número");
			lista1[x] = scan.nextInt();;
			x++;
		}
		
		Arrays.sort(lista1);
		int menor = lista1[0];
		
		while (y < lista1.length) {
			if (lista1[y] == menor) {
				menores++;
			}
			y++;
		}
				
		System.out.println("O menor valor inserido foi: " + menor); //PRINTA O MAIOR VALOR
		System.out.println("Existem " + menores + " valores iguais ao menor valor"); // FALA QUANTOS VALORES SÃO IGUAIS AO MENOR
		
	}

}
