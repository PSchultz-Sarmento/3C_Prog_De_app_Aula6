import java.util.Arrays;
import java.util.Random;

/* CRIA UM GABARITO, COM TODAS AS RESPOSTAS SENDO a E GUARDA NO ARRAY
 * GERA RESPOSTA ALEATÓRIAMENTE E GUARDA NO ARRAY
 * CHECA AS RESPOSTAS CORRETAS E GERA UMA NOTA
 * DIZ SE FOI APROVADO OU NÃO COM BASE NA NOTA
 * 
 */

public class Atv7 {
    char[] gabarito = new char[10];
    char[] respostas = new char[10];
    int nota;
    int x;
    boolean aprovado;

    Random random = new Random();

    public void gerarGabarito() { // 
        for(int i = 0; i < gabarito.length; i++) {
            gabarito[i] = 'a';
            x = random.nextInt(5);
            switch (x) {
                case 0:
                respostas[i] ='a';
                    break;
                case 1:
                    respostas[i] ='b';
                    break;
                case 2:
                    respostas[i] ='c';
                    break;
                case 3:
                    respostas[i] ='d';
                    break;
                case 4:
                    respostas[i] ='e';
                    break;

            }
            if(gabarito[i] == respostas[i]) {
                nota++;
            }
        }
        if(nota >= 6) {
            aprovado = true;
        }
    }

    @Override
    public String toString() {
        return "\nAtv7: " +
                "gabarito: " + Arrays.toString(gabarito) +
                ", \nrespostas: " + Arrays.toString(respostas) + ", \nNota final: " + nota + "\nAprovado = " + aprovado;
    }
}