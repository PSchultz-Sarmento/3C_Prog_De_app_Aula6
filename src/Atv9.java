import java.util.Arrays;

/*Define dois arrays com seus valores
 * 
 * E depois, mostra a diferença entre valores
 * com a mesma posição
 */


public class Atv9 {

	public static void Atv9(String[] args) {
		int[] lista1 = { 10, 8, 20, 13, 15 }; 
		int[] lista2 = { 5, 5, 10, 8, 20};
		int[] lista3 = {0,0,0,0,0};
		int x = 0;
		
		while (x < lista1.length) {
			lista3[x] = lista1[x] - lista2[x];
			x++;
		}		
		
		System.out.print("Primeiro array: ");
		System.out.println(Arrays.toString(lista1));
		System.out.print("Segundo array:  ");
		System.out.println(Arrays.toString(lista2));
		System.out.print("Diferença entre arrays: ");
		System.out.println(Arrays.toString(lista3));

	}



}
