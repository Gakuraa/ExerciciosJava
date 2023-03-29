import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja a tabuada: ");
		
		int numero = input.nextInt();
		for (int i = 1; i <= 12; i++) {
			
			int resultado = i * numero;
			
			System.out.println(numero + " X " + i + " = " + resultado);
			
		}
	}

}
