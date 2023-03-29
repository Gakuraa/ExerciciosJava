import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int soma = 0;
		
		for (int i = 1; i <= 20; i++) {
			
			System.out.println("Digite o " + i + "º número que deseja somar: " );
			int numero = input.nextInt();
			soma += numero;
			
		}
		System.out.println("A soma dos 20 números é de: " + soma);
		
	}

}
