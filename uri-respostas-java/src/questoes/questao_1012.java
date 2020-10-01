package questoes;

import java.util.Scanner;

public class questao_1012 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int maiorAB = (a + b +Math.abs(a - b))/2;
        int maiorBC = (maiorAB + c + Math.abs(maiorAB - c))/2;
        
        System.out.println(maiorBC+" eh o maior");

	}

}
