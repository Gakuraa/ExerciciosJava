import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double salario, totalSalarios = 0;
        int contadorPessoas = 0;
        char resposta = 's';
        
        while (resposta == 's') {
            contadorPessoas++;
            
            System.out.println("Digite o nome da " + contadorPessoas + "ª pessoa:");
            nome = input.nextLine();
            
            System.out.println("Digite o salário da " + contadorPessoas + "ª pessoa:");
            salario = input.nextDouble();
            input.nextLine();
            
            totalSalarios += salario;
            
            System.out.println("Deseja continuar? (s/n)");
            resposta = input.nextLine().charAt(0);
        }
        
        double mediaSalarios = totalSalarios / contadorPessoas;
        System.out.println("Quantidade de pessoas informadas: " + contadorPessoas);
        System.out.println("Média salarial: " + mediaSalarios);
    }
}
