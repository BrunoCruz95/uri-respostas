package questoes;

import java.util.Locale;
import java.util.Scanner;

public class questao_1016 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);

        //int x = 60;
        int y = 90;

        int time = entrada.nextInt();
        y = time * 2;
        System.out.println(y + " " + "minutos");
	}

}
