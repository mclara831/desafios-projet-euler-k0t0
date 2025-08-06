package fibonnacci;

public class fibonacci {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2, result = 0, sum = 0;

        while (result < 4000000) {

            if (num2 % 2 == 0) {
                sum += num2;
            }
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }

        System.out.println("Resultado da soma dos números equilibrados: " + sum);
    }
}
