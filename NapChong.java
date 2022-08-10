import java.util.Scanner;

public class NapChong {
    static Scanner sc = new Scanner(System.in);

    public static boolean isPrime(int n)
    {
        for (int i = 2; i < Math.sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrime(long n)
    {
        for (int i = 2; i < Math.sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrime(float n)
    {
        if (n == Math.ceil(n))
        {
            for (int i = 2; i < Math.sqrt(n); i++)
            {
                if (n % i == 0) return false;
            }
            return true;
        }
        else
            return false;
    }

    public static boolean isPrime(double n)
    {
        if (n == Math.ceil(n))
        {
            for (int i = 2; i < Math.sqrt(n); i++)
            {
                if (n % i == 0) return false;
            }
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(36));
        System.out.println(isPrime(17.0));
        System.out.println(isPrime(21.5));
    }
}
