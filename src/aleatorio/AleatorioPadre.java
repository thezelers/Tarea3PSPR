package aleatorio;

import java.io.*;
import java.util.Scanner;

public class AleatorioPadre {
	public static void main(String[] args) throws Exception {
		Process proc = new ProcessBuilder("java","-jar", "rand.jar").start();
		//rand.jar == AleatorioHijo
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(proc.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		Scanner sc = new Scanner(System.in);
		boolean fin = true;
		String aux;
		while(fin) {
			 aux = sc.nextLine();
			
			if (aux.equalsIgnoreCase("fin")){
				fin=false;
			}
			
			if (fin) {
				bw.write(aux);
				bw.newLine();
				bw.flush();
				System.out.println(br.readLine());
			}
			
		}
		sc.close();
 	}

}
