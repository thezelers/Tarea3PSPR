package mayusculas;

import java.util.Scanner;

public class MayusculasHijo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(s.toUpperCase());
		}
		sc.close();

	}

}