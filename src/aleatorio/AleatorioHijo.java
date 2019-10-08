package aleatorio;

import java.util.Scanner;

public class AleatorioHijo {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			num = (int) ((Math.random()*10)+1);
			System.out.println(num);
			sc.nextLine();
		}
		sc.close();
	}

}
