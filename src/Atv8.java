import java.util.Arrays;


/* Cria um array com 10 números
 * 
 * No segundo array, são colocados os 
 * numeros de posição impar do primeiro array
 * 
 * E No terceiro array, os numeros do primeiro array
 * são somados com os itens de mesma posição do segundo array
 * 
 */

public class Atv8 {

	public static void Atv8(String[] args) {

		int[] vt1 = {45,8,20,13,15,9,10,8,51,14};
		int[] vt2 = {0,0,0,0,0};
		int[] vt3 = {0,0,0,0,0};
		int x = 0;
		int y = 0;
		
		while (x < vt1.length) {
			if (x%2 == 0) {
				vt2[y] = vt1[x];
				vt3[y] = vt1[y] + vt2[y];
				x++;
				y++;
			}
			else {
				x++;
			}
		}	
		
		System.out.println(Arrays.toString(vt1));
		System.out.println(Arrays.toString(vt2));
		System.out.println(Arrays.toString(vt3));
	}

}
