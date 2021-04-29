import java.util.Arrays;

public class Atv4 {

	public static void Atv4(String[] args) {
		int[] lista1 = { 5, 9, 12, 3, 4 }; //define um array
		int[] lista2 = { 7, 2, 20, 5, 13}; // define outro array
		int[] lista3 = {0,0,0,0,0}; // deixa um array vazio
		int x = 0; // DEFINE A POSIÇÃO ATUAL DO ARRAY
		
		while (x < lista1.length) { // soma os itens de posição igual no primeiro e segundo array
			lista3[x] = lista1[x] + lista2[x]; // e coloca na mesma posição no terceiro array
			x++;
		}		
		
		//PRINTA OS ARRAYS
		
		System.out.print("Primeiro array: ");
		System.out.println(Arrays.toString(lista1));
		System.out.print("Segundo array:  ");
		System.out.println(Arrays.toString(lista2));
		System.out.print("Terceiro array: ");
		System.out.println(Arrays.toString(lista3));

	}



}
