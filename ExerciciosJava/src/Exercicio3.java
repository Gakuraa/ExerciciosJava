public class Exercicio3 {
    
	public static void main(String[] args) {
        int anterior = 0, atual = 1, proximo;
        
        System.out.println(anterior);
        System.out.println(atual);
        
        for (int i = 2; i < 30; i++) {
            proximo = anterior + atual;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
        }
    }
}
