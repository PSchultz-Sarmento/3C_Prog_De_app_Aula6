
public class Atv3 {
	
	public static void Atv3(String[] args) {
		
		
		
		System.out.println("Primeira sequencia");//SEPARA AS SEQUENCIAS
		Seq1();
	}
		
	public static void Seq1() { // PRINTA TODOS OS NUMEROS DE 1 A 100
		int x = 1;
		while (x <= 100) {
			System.out.println(x);
			x++;
			try {
				Thread.sleep(80);// DA UM DELAY, APENAS ESTÉTICO
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Segunda sequencia");//SEPARA AS SEQUENCIAS
		Seq2();
		
	}

	private static void Seq2() { //PRINTA OS NUMEROS ENTRE 101 E 200
		int x = 101;
		while (x <= 200) {
			System.out.println(x);
			x++;
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Terceira sequencia"); //SEPARA AS SEQUENCIAS
		Seq3();
		
	}

	private static void Seq3() { //PRINTA OS NUMERO ENTRE 201 E 300
		int x = 201;
		while (x <= 300) {
			System.out.println(x);
			x++;
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}}


