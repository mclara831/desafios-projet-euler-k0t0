package factor;

public class factor {
    public static void main(String[] args) {
        int primeFactor = 0;
        long number = 600851475143L;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                primeFactor = i;
                number = number / i;
            }
        }

        System.out.println("O maior fator é = " + primeFactor);
    }
}
