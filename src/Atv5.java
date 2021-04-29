import java.util.Arrays;
import java.util.Scanner;

public class Atv5 {
	
@SuppressWarnings("resource")
public static void Atv5(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] lista1 = {0,0,0,0,0}; //DEFINE ARRAYS
	int[] lista2 = {0,0,0,0,0};
	int x = 0;
	int y = lista2.length - 1;
	
	while (x < lista1.length) { //SALVA OS NUMEROS NOS ARRAYS
		System.out.println("Insira um numero: ");
		lista1[x] = scan.nextInt();//NO PRIMEIRO ARRAY, NA SEQUENCIA COLOCADA
		lista2[y] = lista1[x]; //E NO SEGUNDO, A SEQUENCIA INVERTIDA
		x++;
		y--;
	}
	
	//PRINTA OS ARRAYS
	
	System.out.print("Primeiro array: ");
	System.out.println(Arrays.toString(lista1));
	System.out.print("Segundo array:  ");
	System.out.println(Arrays.toString(lista2));
}

}
