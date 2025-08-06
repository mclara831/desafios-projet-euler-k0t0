package multiples;

public class multiples {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 1; i < 1000; i++) {
            if((i % 3 == 0) || (i % 5 == 0)) {
                soma+=i;
            }
        }
        System.out.println("Resultado dos múltiplos de 3 ou 5 = " + soma);
    }
}
