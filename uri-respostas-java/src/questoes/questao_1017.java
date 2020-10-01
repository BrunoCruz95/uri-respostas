package questoes;

import java.util.Scanner;

public class questao_1017 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int velocidade = entrada.nextInt();
        int tempo = entrada.nextInt();
        double distancia = velocidade * tempo;
        double consumo = distancia / 12;

        System.out.printf("%.3f\n", consumo);

	}

}
