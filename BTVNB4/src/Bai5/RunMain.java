package Bai5;

public class RunMain {
        public static boolean isPrime(int n)
        {
            for (int i = 2; i * i <= n; i++)
                if (n % i == 0)
                    return false;
            return n > 1;
        }
        public static boolean isPrime(long n)
        {
            for (int i = 2; i * i <= n; i++)
                if (n % i == 0)
                    return false;
            return n > 1;
        }

        public static boolean isPrime(float n)
        {
            return false;
        }

        public static boolean isPrime(double n)
        {
            return false;
        }

    public static void main(String[] args) {
        System.out.println(isPrime(5)); //int
        System.out.println(isPrime(9)); //int
        System.out.println(isPrime(12L)); //long
        System.out.println(isPrime(7L)); //long
        System.out.println(isPrime(3.5f)); //float
        System.out.println(isPrime(12.0d)); //double
    }
    }
